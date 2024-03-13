public class Jogador {
    private Arma arma;
    String nome;
    private int energia;
    private int vida;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    void atacar(Jogador alvo) {
        if (this.energia >= this.arma.getCustoDeEnergia()) {
             alvo.vida -= this.arma.getDano();
            this.energia -= this.arma.getCustoDeEnergia();
        }

    }

    Jogador() {
    }

    Jogador(String nome, Arma arma, int vida, int energia) {
        this.nome = nome;
        this.energia = energia;
        this.vida = vida;
        this.arma = arma;
    }

    public String toString() {
        return "Personagem: " + this.nome + "Vida: " + this.vida + " Energia: " + this.energia;
    }
}
