public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        cozinheiro.prepararPrato(index);
    }

//    public Pirata lutar(Pirata pirata){
//        return pirata.getNome();
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
