public class Main {
    public static void main(String[] args) {
        Bruxa bruxa = new Bruxa(20,40,50);
        Zumbi zumbi = new Zumbi(50,90,40);
        Vampiro vampiro = new Vampiro(1000,100,90);

        bruxa.aprenderFeitico("Avada Kedavra", 100);

        bruxa.listarFeitcos();

        vampiro.transformar();
        vampiro.recuperarVida();
        vampiro.atacarComMordida(bruxa);

        bruxa.lancarFeiticoAlvo(vampiro,0);


    }
}