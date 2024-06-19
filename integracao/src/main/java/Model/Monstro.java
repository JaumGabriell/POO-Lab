package Model;
public class Monstro {
    private int idMonstro;
    private String Tipo;
    private int Dano;
    private int Vida;
    private int Dungeon_idDungeon;

    public Monstro(String tipo, int dano, int vida, int dungeon_idDungeon) {
        Tipo = tipo;
        Dano = dano;
        Vida = vida;
        Dungeon_idDungeon = dungeon_idDungeon;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getDano() {
        return Dano;
    }

    public int getVida() {
        return Vida;
    }

    public int getDungeon_idDungeon() {
        return Dungeon_idDungeon;
    }
}