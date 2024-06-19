package Model;

public class Dungeon {
    private int idDungeon;
    private String Tipo;
    private int NAndares;

    public Dungeon(String tipo, int NAndares) {
        Tipo = tipo;
        this.NAndares = NAndares;
    }

    public int getIdDungeon() {
        return idDungeon;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getNAndares() {
        return NAndares;
    }

}