package DAO;
import Model.Deus;
import java.sql.SQLException;
import java.util.ArrayList;
public class DeusDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertDeus(Deus deus) {
        connectToDB();
        String sql = "INSERT INTO deus (Nome,Ritual) values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, deus.getNome());
            pst.setString(2, deus.getRitual());
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
    public boolean updateDeus(int id, Deus deus) {
        connectToDB();
        String sql = "UPDATE deus SET Nome=?, Ritual=? where idDeus=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, deus.getNome());
            pst.setString(2, deus.getRitual());
            pst.setInt(3,id);
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
    public boolean deleteDeus(int id) {
        connectToDB();
        String sql = "DELETE FROM Deus where idDeus=?";
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
    public ArrayList<Deus> selectDeus() {
        ArrayList<Deus> deuses = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Deus";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de deuses: ");
            while (rs.next()) {
                Deus deusAux = new Deus(rs.getString("Nome"),rs.getString("Ritual"));
                System.out.println("Nome = " + deusAux.getNome());
                System.out.println("Ritual = " + deusAux.getRitual());
                System.out.println("--------------------------------");
                deuses.add(deusAux);
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
        return deuses;
    }
}