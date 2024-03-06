//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Rato rato = new Rato();

        // colocando as informações do gato
        gato.cor = "Laranja";
        gato.idade = 4;
        gato.velocidade = 13;

        // colocando as informações do rato

        rato.velocidade = 12.3f;

        // o rato esta escondido
        rato.esconder();

        // o gato esta brincando
        gato.brincar();

        // o rato esta caçando comida
        rato.procurarComida();

        gato.caçar(rato);

        // mostrando as informações do gato e do rato
        System.out.println("Informacoes do gato: ");
        System.out.println(gato.toString());
        System.out.println("Informacoes do rato: ");
        System.out.println(rato.toString());

        }

}