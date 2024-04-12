public class Garra {
    private int pressao;

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    public void agarrarPeca(){
        System.out.println("peca agarrada");
    }

    // sobrecarga
    public void agarrarPeca(int posicao){
        System.out.println("peca agarrada na posicao: " + posicao);

    }
}
