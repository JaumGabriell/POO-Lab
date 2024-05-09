import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Estoque {
    private ArrayList<Item> itensArray = new ArrayList<>();
    private Set<Item> itensHash = new HashSet<Item>();
    private HashMap<String,Item> itensMap = new HashMap<>();

    public void adcionarArray(Item item){
        itensArray.add(item);
    }

    public Item buscar(int posicao){
        return  itensArray.get(posicao);
    }

    public void deletar(int posicao){
        itensArray.remove(posicao);
    }

    public void deletar(Item item){
        itensArray.remove(item);
    }
    public void modificar(Item item, int posicao){
        itensArray.set(posicao, item);
    }

    public ArrayList<Item> getItensArray() {
        return itensArray;
    }

    public Set<Item> getItensHash() {
        return itensHash;
    }
    public HashMap<String,Item> getItensMap() {
        return itensMap;
    }

    public void mostrarItens(){
        System.out.print("[");
        for (Item item : itensArray){
            try{
                System.out.print("  " + item.getNome() + " - " + item.getValor() + ", ");
            }catch (NullPointerException e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("]");
    }

    public void mostrarItensHash(){
        System.out.println("[");
        for (Item item : itensHash){
                System.out.println("  " + item.getNome() + " - " + item.getValor() + ", ");
        }
        System.out.println("]");
    }

    public  void removeItensHash(int index){
        itensHash.remove(index);
    }
    public void mostrarItensMap(){
        System.out.print("[");
        itensMap.forEach(
                (k, v) -> {
                    if (k != null){
                        System.out.print("  Chave : \"" + k + "\" Valor : {" + "  " + v.getNome() + " - " + v.getValor() + " }, ");
                    }
                }
        );
        System.out.println("]");
    }
}