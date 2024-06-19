package Model;

public class Cavaleiro_has_Deus {
    private int Cavaleiro_idCavaleiro;
    private int Deus_idDeus;

    public Cavaleiro_has_Deus(int cavaleiro_idCavaleiro, int deus_idDeus) {
        Cavaleiro_idCavaleiro = cavaleiro_idCavaleiro;
        Deus_idDeus = deus_idDeus;
    }

    public int getCavaleiro_idCavaleiro() {
        return Cavaleiro_idCavaleiro;
    }

    public int getDeus_idDeus() {
        return Deus_idDeus;
    }
}