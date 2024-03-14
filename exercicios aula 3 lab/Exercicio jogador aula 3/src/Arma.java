public class Arma {
    private int dano;
    private int custoDeEnergia;
    private String nome;

    public int getDano() {
        return this.dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getCustoDeEnergia() {
        return this.custoDeEnergia;
    }

    public void setCustoDeEnergia(int custoDeEnergia) {
        this.custoDeEnergia = custoDeEnergia;
    }

    Arma(int dano, int custoDeEnergia, String nome)
    {
        this.dano = dano;
        this.custoDeEnergia = custoDeEnergia;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "dano=" + dano +
                ", custoDeEnergia=" + custoDeEnergia +
                ", nome='" + nome + '\'' +
                '}';
    }
}
