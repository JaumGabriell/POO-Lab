public class BracoArticulado extends Robo {
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int totalDeRobos, int energiaMaxima, int numeroDeArticulacoes, Camera camera) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = new Garra();
    }

    public void trabalhar(){

    }

}
