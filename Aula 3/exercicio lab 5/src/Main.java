//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma(24,12);
        Arma adaga = new Arma(12, 12);

        Jogador personagem1 = new Jogador("Darce ", espada, 100, 100);
        Jogador personagem2 = new Jogador("Enki ",adaga, 100, 100);

        personagem1.atacar(personagem2);

        System.out.println(personagem1.toString());
        System.out.println(personagem2.toString());

    }
}