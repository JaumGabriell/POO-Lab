package DAO;
import Model.Cavaleiro;
import java.sql.SQLException;
import java.util.ArrayList;
public class CavaleiroDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertCavaleiro(Cavaleiro cavaleiro) {
        connectToDB();
        String sql = "INSERT INTO cavaleiro (Nome,Bencao,Sanidade,Vida,Dungeon_idDungeon) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cavaleiro.getNome());
            pst.setString(2, cavaleiro.getBencao());
            pst.setInt(3, cavaleiro.getSanidade());
            pst.setInt(4, cavaleiro.getVida());
            pst.setInt(5, cavaleiro.getDungeon_idDungeon());

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
    public boolean updateCavaleiro(int id, Cavaleiro cavaleiro) {
        connectToDB();
        String sql = "UPDATE monstro SET Nome=?, Bencao=?, Sanidade=?, Vida = ?, Dungeon_idDungeon = ?  where idCavaleiro=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, cavaleiro.getNome());
            pst.setString(2, cavaleiro.getBencao());
            pst.setInt(3, cavaleiro.getSanidade());
            pst.setInt(4, cavaleiro.getVida());
            pst.setInt(5, cavaleiro.getDungeon_idDungeon());
            pst.setInt(6,id);
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
    public boolean deleteCavaleiro(int id) {
        connectToDB();
        String sql = "DELETE FROM cavaleiro where idCavaleiro=?";
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
    public ArrayList<Cavaleiro> selectCavaleiro() {
        ArrayList<Cavaleiro> cavaleiros = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM cavaleiro";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de cavaleiros: ");
            while (rs.next()) {
                Cavaleiro cavaleiroAux = new Cavaleiro(rs.getString("Nome"),rs.getString("Bencao"),rs.getInt("Sanidade"),rs.getInt("Vida"),rs.getInt("Dungeon_idDungeon"));
                System.out.println("Nome = " + cavaleiroAux.getNome());
                System.out.println("Bencao = " + cavaleiroAux.getBencao());
                System.out.println("Sanidade = " + cavaleiroAux.getSanidade());
                System.out.println("Vida = " + cavaleiroAux.getVida());
                System.out.println("Dungeonid = " + cavaleiroAux.getDungeon_idDungeon());
                System.out.println("--------------------------------");
                cavaleiros.add(cavaleiroAux);
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
        return cavaleiros;
    }
}