public class Main {
    public static void main(String[] args) {
        // criando camera
        Camera camera1 = new Camera();
        System.out.println(camera1.acharPecas());

        // pacotes
        Pacote pacote = new Pacote();
        pacote.Pacote(25);
        // criando um bracoArticulado
        BracoArticulado bracoArticulado = new BracoArticulado(50,"juju",1,70,3, camera1);

        // criando um empilhador
        Empilhador empilhador = new Empilhador(40,"gaga",1,60,50);


        // braco articulado trabalhando
       // bracoArticulado.trabalhar();

        //bracoArticulado.recarregar(2);

        //bracoArticulado.trocarEnergia(empilhador);

        bracoArticulado.trabalhar();



         //empilhador

        empilhador.adicionarPacote(100);



    }
}