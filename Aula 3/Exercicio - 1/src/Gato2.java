public class Gato2 {

    private static int numeroDeGatos;
    private String nome;
    private int idade;
    private int velocidade;

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato2.numeroDeGatos = numeroDeGatos;
    }

    public Gato2(){
            numeroDeGatos++;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
