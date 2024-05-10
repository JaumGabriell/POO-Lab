public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void setNumeroDeSeguidores(int numeroDeSeguidores) {
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores) {
        super(nome, comidaFavorita, poder);
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        if(this.getPoder() > pirata.getPoder()){
            setNumeroDeSeguidores(getNumeroDeSeguidores()+1);
        }else {
            System.out.println("Não fara parte da tripulação");
        }

    }

    @Override
    public void darOrdens() {
        System.out.println("O capitão está ordenando " + getNumeroDeSeguidores() + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O capitão está mudando a rota");

    }
}
