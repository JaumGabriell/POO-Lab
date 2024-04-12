public class Empilhador extends Robo {
    private int pesoMaximo;
    private Pacote[] pacotes;

    public Empilhador(int energia, String nome, int totalDeRobos, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
        this.pacotes = new Pacote[5];
    }


    public void adicionarPacote(int peso){

        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] == null){
                    if(peso <= this.pesoMaximo){
                        pacotes[i] = new Pacote();
                        System.out.println("pacote adicionado");
                        break;

                    }else {
                        System.out.println("peso maximo atingido");
                        break;
                    }
            }
        }
    }

    public void removePacote(int posicao){
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null){
                if (i == posicao){
                    pacotes[posicao] = null;
                }
            }
        }
    }

    public void mostrarPacote(){
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null){
                System.out.println(pacotes[i].getPeso());
            }
        }
    }
}
