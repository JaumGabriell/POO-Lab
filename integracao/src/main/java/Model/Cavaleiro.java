package Model;

public class Cavaleiro {
    private int idCavaleiro;
    private String Nome;
    private String Bencao;
    private int Sanidade;
    private int Vida;
    private int Dungeon_idDungeon;

    public void setVida(int vida) {
        Vida = vida;
    }

    public Cavaleiro(String nome, String bencao, int sanidade, int vida, int dungeon_idDungeon) {
        Nome = nome;
        Bencao = bencao;
        Sanidade = sanidade;
        Vida = vida;
        Dungeon_idDungeon = dungeon_idDungeon;
    }

    public String getNome() {
        return Nome;
    }

    public String getBencao() {
        return Bencao;
    }

    public int getSanidade() {
        return Sanidade;
    }

    public int getVida() {
        return Vida;
    }

    public int getDungeon_idDungeon() {
        return Dungeon_idDungeon;
    }
}
