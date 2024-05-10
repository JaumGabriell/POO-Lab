import java.util.ArrayList;

public class Cozinheiro extends Pirata {

    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();
    Receita receita;

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
        this.receita = new Receita();
    }

    public String prepararPrato(int index){
        return livroDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas(){
        System.out.print("[");
        for (Receita receita : livroDeReceitas){
            try{
                System.out.print("  " + receita.getNome());
            }catch (NullPointerException e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("]");

    }

    public void adcionarReceita(Receita receita){
        livroDeReceitas.add(receita);
    }
}
