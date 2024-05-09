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
        System.out.println(itensArrayList.get(posicao));
    }

    public Item buscar2(Item item){
        int index = itensArrayList.indexOf(item);
        return (Item) itensArrayList.get(index);
    }

    public void deletar(int posicao){
        itensArrayList.remove(posicao);
    }

    public void deletar(Item item){
        itensArrayList.remove(item);
    }



}
