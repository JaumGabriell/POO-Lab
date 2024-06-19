package Model;

public class Deus {
    private int idDeus;
    private String Nome;
    private String Ritual;

    public Deus(String nome, String ritual) {
        Nome = nome;
        Ritual = ritual;
    }

    public String getNome() {
        return Nome;
    }

    public String getRitual() {
        return Ritual;
    }
}
