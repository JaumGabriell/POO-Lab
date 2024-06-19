package DAO;
import Model.Monstro;
import java.sql.SQLException;
import java.util.ArrayList;
public class MonstroDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    //INSERT
    public boolean insertMonstro(Monstro monstro) {
        connectToDB();
        String sql = "INSERT INTO monstro (Tipo,Dano,Vida,Dungeon_idDungeon) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, monstro.getTipo());
            pst.setInt(2, monstro.getDano());
            pst.setInt(3, monstro.getVida());
            pst.setInt(4,monstro.getDungeon_idDungeon());
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
    public boolean updateMonstro(int id, Monstro monstro) {
        connectToDB();
        String sql = "UPDATE monstro SET Tipo=?, Dano=?, Vida=?, Dungeon_idDungeon=? where idMonstro=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, monstro.getTipo());
            pst.setInt(2, monstro.getDano());
            pst.setInt(3,monstro.getVida());
            pst.setInt(4,monstro.getDungeon_idDungeon());
            pst.setInt(5,id);
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
    public boolean deleteMonstro(int id) {
        connectToDB();
        String sql = "DELETE FROM monstro where idMonstro=?";
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
    public ArrayList<Monstro> selectMonstro() {
        ArrayList<Monstro> monstros = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM monstro";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de monstros: ");
            while (rs.next()) {
                Monstro monstroAux = new Monstro(rs.getString("Tipo"),rs.getInt("Dano"),rs.getInt("Vida"), rs.getInt("Dungeon_idDungeon"));
                System.out.println("Tipo = " + monstroAux.getTipo());
                System.out.println("Dano = " + monstroAux.getDano());
                System.out.println("Vida = " + monstroAux.getVida());
                System.out.println("Dungeonid = " + monstroAux.getDungeon_idDungeon());
                System.out.println("--------------------------------");
                monstros.add(monstroAux);
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
        return monstros;
    }
}