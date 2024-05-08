import java.util.ArrayList;

public class Estoque {
    ArrayList<Item> itensArrayList = new ArrayList<>();

    public ArrayList<Item> getItensArrayList() {
        return itensArrayList;
    }

    public void adicionarArray(Item item){
        itensArrayList.add(item);
    }

    public void buscar(int posicao){
        itensArrayList.get(posicao);
    }

    public void deletar(int posicao){
        itensArrayList.remove(posicao);
    }

    public void deletar(Item item){
        itensArrayList.remove(item);
    }
}
