package DAO;
import Model.Dungeon;
import java.sql.SQLException;
import java.util.ArrayList;
public class DungeonDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertDungeon(Dungeon dungeon) {
        connectToDB();
        String sql = "INSERT INTO Dungeon (Tipo, NAndares) values(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dungeon.getTipo());
            pst.setInt(2, dungeon.getNAndares());
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
    public boolean updateDungeon(int id, Dungeon dungeon) {
        connectToDB();
        String sql = "UPDATE Dungeon SET Tipo=?, NAndares=? where idDungeon=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dungeon.getTipo());
            pst.setInt(2, dungeon.getNAndares());
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
    public boolean deleteDungeon(int id) {
        connectToDB();
        String sql = "DELETE FROM Dungeon where idDungeon=?";
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
    public ArrayList<Dungeon> selectDungeon() {
        ArrayList<Dungeon> dungeons = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Dungeon";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de dungeons: ");
            while (rs.next()) {
                Dungeon dungeonAux = new Dungeon(rs.getString("Tipo"), rs.getInt("NAndares"));
                System.out.println("Tipo = " + dungeonAux.getTipo());
                System.out.println("NAndares = " + dungeonAux.getNAndares());
                System.out.println("--------------------------------");
                dungeons.add(dungeonAux);
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
        return dungeons;
    }
}