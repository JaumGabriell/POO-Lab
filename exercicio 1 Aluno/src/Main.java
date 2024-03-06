import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // leitura

        // colocando as informações dos alunos
        Aluno aluno = new Aluno();
        aluno.matricula = 12;
        aluno.nome = "Juju";
        aluno.np1 = 50;
        aluno.np2 = 50;
        aluno.periodo = 4;

        // calculando a media do aluno

        if(aluno.calculaMedia() < 60) {

            // lendo a nota da np3

            int np3; // nota np3 do aluno

            System.out.println("Digite a nota da NP3: ");

            np3 = entrada.nextInt();

            if (aluno.calculaNP3(np3)>=50)
            {
                System.out.println("Passou");
            }else {
                System.out.println("Lascou");
            }

        }else {
            System.out.println("Passou");
        }

        System.out.println(aluno.toString());

        entrada.close();

    }
}