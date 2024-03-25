//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int estado;
    int ctd = 0;
    Scanner entrada = new Scanner(System.in);

    MemoriaUSB memoria1 = new MemoriaUSB();
    MemoriaUSB memoria2 = new MemoriaUSB();
    MemoriaUSB memoria3 = new MemoriaUSB();

    Cliente cliente = new Cliente("credo",22222222);
    System.out.println("digite 1 - promocao 1");
    System.out.println("digite 2 - promocao 2");
    System.out.println("digite 3 - promocao 3");
    System.out.println("digite qualquer outro numero - fim");

        for (int i = 0;i < cliente.computadores.length; i++){
            estado = entrada.nextInt();

            switch (estado) {
                case(1):
                    cliente.computadores[i].marca = "Positivo";
                    cliente.computadores[i].preco = 3300;
                    cliente.computadores[i].HB[0].nome = "Pentium Core I3";
                    cliente.computadores[i].HB[1].nome = "8 Gb de Me1moria RAM";
                    cliente.computadores[i].HB[2].nome = "500Gb de HD";
                    cliente.computadores[i].HB[0].capacidade = 2200;
                    cliente.computadores[i].HB[1].capacidade = 8;
                    cliente.computadores[i].HB[2].capacidade = 500;
                    cliente.computadores[i].system.nome = "Linux Ubuntu (32 bits)";
                    memoria1.nome = "Pen-drive";
                    memoria1.capacidade = 16;
                    cliente.computadores[i].addMemoriaUSB(memoria1);
                    ctd++;
                    break;

                case(2):

                    cliente.computadores[i].marca = "Acer";
                    cliente.computadores[i].preco = 8800;
                    cliente.computadores[i].HB[0].nome = "Pentium core I5";
                    cliente.computadores[i].HB[1].nome = "16 Gb de Memoria RAM";
                    cliente.computadores[i].HB[2].nome = "1 Tb de HD";
                    cliente.computadores[i].HB[0].capacidade = 3370;
                    cliente.computadores[i].HB[1].capacidade = 16;
                    cliente.computadores[i].HB[2].capacidade = 1000;
                    cliente.computadores[i].system.nome = "Sistema Operacianal Windows 8";
                    memoria2.nome = "Pen-drive";
                    memoria2.capacidade = 32;
                    cliente.computadores[i].addMemoriaUSB(memoria2);
                    ctd++;
                    break;

                case (3):

                    cliente.computadores[i].marca = "Vaio";
                    cliente.computadores[i].preco = 4800;
                    cliente.computadores[i].HB[0].nome = "Pentium core I7";
                    cliente.computadores[i].HB[1].nome = "32 Gb de Memoria RAM";
                    cliente.computadores[i].HB[2].nome = "2 Tb de HD";
                    cliente.computadores[i].HB[0].capacidade = 3370;
                    cliente.computadores[i].HB[1].capacidade = 32;
                    cliente.computadores[i].HB[2].capacidade = 2000;
                    cliente.computadores[i].system.nome = "Sistema Operacianal Windows 10";
                    memoria3.nome = "Pen-drive";
                    memoria3.capacidade = 1000;
                    cliente.computadores[i].addMemoriaUSB(memoria3);
                    ctd++;
                    break;

                default:
                    i+= cliente.computadores.length;
                    break;
            }

        }

        for (int i = 0; i < ctd; i++) {
            if(cliente.computadores[i]!=null) {
                cliente.computadores[i].mostraPCConfings();
                cliente.calculaTotalCompra();
            }
        }
        System.out.println("Total");
        System.out.println(cliente.calculaTotalCompra());

    }
}