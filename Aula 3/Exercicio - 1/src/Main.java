//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gato2 gatinho = new Gato2();
        gatinho.setNome("dudu");
        System.out.println(gatinho.getNome());

        System.out.println(Gato2.getNumeroDeGatos());
    }
}