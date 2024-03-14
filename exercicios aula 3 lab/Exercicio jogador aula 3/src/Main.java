
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma(10,5,"espada");
        Arma adaga = new Arma(12,7,"adaga");

        Jogador jogador1 = new Jogador("joao",espada,30,20);
        Jogador jogador2 = new Jogador("romano",adaga,35,30);

        System.out.println(jogador2);

    }
}