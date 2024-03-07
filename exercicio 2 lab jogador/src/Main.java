//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // criando armas 1 e 2
        Arma arma1 = new Arma(5,6);
        Arma arma2 = new Arma(4,5);


        // criando jogadores 1 e 2
        Jogador jogador1 = new Jogador(arma1,20,30);
        Jogador jogador2 = new Jogador(arma2,15,30);

        // jogador 1 atacando jogador 2
        jogador1.atacar(jogador2);

        System.out.println(jogador1.toString());

    }

}