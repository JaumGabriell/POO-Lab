public class Vampiro extends Monstro {
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    public void transformar(){
        this.formaDeMorcego = true;
        System.out.println("Transformando!!!!");
        super.setEnergia(getEnergia()-10);
    }

    public void recuperarVida(){
        this.medidorDeSangue -= 5;
        System.out.println("what is a man, but miserable little pile of secrets");
    }

    public void atacarComMordida(Monstro monstroAlvo){
        monstroAlvo.setVida(getVida()-3);
        System.out.println("monstro mamado");

    }
}
