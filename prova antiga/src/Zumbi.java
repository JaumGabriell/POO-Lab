public class Zumbi extends Monstro {
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia) {
        super(idade, vida, energia);
    }

    private void atacarComMordida(Monstro alvo){
        alvo.setVida(getVida()-3);
        System.out.println("mamado");
        super.setEnergia(getEnergia()-5);
    }
}
