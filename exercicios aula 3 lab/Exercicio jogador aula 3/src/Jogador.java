public class Jogador {
    private Arma arma;
    String nome;
    private int energia;
    private int vida;

    public Arma getArma() {
        return this.arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return this.energia;
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

    public void atacar(Jogador alvo){
        if (this.energia >= this.arma.getCustoDeEnergia()) {
            alvo.vida -= this.arma.getDano();
            this.energia -= this.arma.getCustoDeEnergia();
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    Jogador(){

    }

    Jogador(String nome, Arma arma, int energia, int vida)
    {
        this.nome = nome;
        this.energia = energia;
        this.vida = vida;
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + this.arma +
                ", energia=" + this.energia +
                ", vida=" + this.vida +
                '}';
    }

}
