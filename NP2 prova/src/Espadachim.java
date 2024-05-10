public class Espadachim extends Pirata implements Comandar{
    public Espadachim(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    @Override
    public void darOrdens() {
        System.out.println("O imediato está ordenando os tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O emediato está mudando a rota");

    }



}
