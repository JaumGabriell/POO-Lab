package Model;

public class Arma {
    private int idArma;
    private String Tipo;
    private String Poder;
    private int Cavaleiro_idCavaleiro;

    public Arma(String tipo, String poder, int cavaleiro_idCavaleiro) {
        Tipo = tipo;
        Poder = poder;
        Cavaleiro_idCavaleiro = cavaleiro_idCavaleiro;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getPoder() {
        return Poder;
    }

    public int getCavaleiro_idCavaleiro() {
        return Cavaleiro_idCavaleiro;
    }
}