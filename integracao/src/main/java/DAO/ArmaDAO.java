package DAO;
import Model.Arma;
import java.sql.SQLException;
import java.util.ArrayList;
public class ArmaDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertArma(Arma arma) {
        connectToDB();
        String sql = "INSERT INTO Arma (Tipo,Poder,Cavaleiro_idCavaleiro) values(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, arma.getTipo());
            pst.setString(2, arma.getPoder());
            pst.setInt(3,arma.getCavaleiro_idCavaleiro());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    //UPDATE
    public boolean updateArma(int id, Arma arma) {
        connectToDB();
        String sql = "UPDATE Arma SET Tipo=?, Poder=?, Cavaleiro_idCavaleiro=? where idArma=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, arma.getTipo());
            pst.setString(2, arma.getPoder());
            pst.setInt(3,arma.getCavaleiro_idCavaleiro());
            pst.setInt(4,id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    //DELETE
    public boolean deleteArma(int id) {
        connectToDB();
        String sql = "DELETE FROM Arma where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
    //SELECT
    public ArrayList<Arma> selectUser() {
        ArrayList<Arma> armas = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Arma";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de armas: ");
            while (rs.next()) {
                Arma armaAux = new Arma(rs.getString("Tipo"),rs.getString("Poder"), rs.getInt("Cavaleiro_idCavaleiro"));
                System.out.println("Tipo = " + armaAux.getTipo());
                System.out.println("Poder = " + armaAux.getPoder());
                System.out.println("Poder = " + armaAux.getCavaleiro_idCavaleiro());

                System.out.println("--------------------------------");
                armas.add(armaAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return armas;
    }
}