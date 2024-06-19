package DAO;
import Model.Cavaleiro_has_Deus;
import java.sql.SQLException;
import java.util.ArrayList;
public class Cavaleiro_has_DeusDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertCavaleiro_has_Deus(Cavaleiro_has_Deus cavaleiroHasDeus) {
        connectToDB();
        String sql = "INSERT INTO Cavaleiro_has_Deus (Cavaleiro_idCavaleiro,Deus_idDeus) values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, cavaleiroHasDeus.getCavaleiro_idCavaleiro());
            pst.setInt(2, cavaleiroHasDeus.getDeus_idDeus());
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
    public boolean updateCavaleiro_has_Deus(int id, Cavaleiro_has_Deus cavaleiroHasDeus) {
        connectToDB();
        String sql = "UPDATE Cavaleiro_has_Deus SET nome=?, cpf=? where id=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, cavaleiroHasDeus.getCavaleiro_idCavaleiro());
            pst.setInt(2, cavaleiroHasDeus.getDeus_idDeus());
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
    public boolean deleteCavaleiro_has_Deus(int id) {
        connectToDB();
        String sql = "DELETE FROM Cavaleiro_has_Deus where id=?";
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
    public ArrayList<Cavaleiro_has_Deus> selectUser() {
        ArrayList<Cavaleiro_has_Deus> cavaleiroHasDeuses = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Cavaleiro_has_Deus";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de cavaleiroHasDeuses: ");
            while (rs.next()) {
                Cavaleiro_has_Deus cavaleiroHasDeusAux = new Cavaleiro_has_Deus(rs.getInt("Cavaleiro_idCavaleiro"),rs.getInt("Deus_idDeus"));
                System.out.println("nome = " + cavaleiroHasDeusAux.getCavaleiro_idCavaleiro());
                System.out.println("cpf = " + cavaleiroHasDeusAux.getDeus_idDeus());
                System.out.println("--------------------------------");
                cavaleiroHasDeuses.add(cavaleiroHasDeusAux);
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
        return cavaleiroHasDeuses;
    }
}