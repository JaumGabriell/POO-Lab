import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item(1,"juju's sword");
        Item item2 = new Item(2,"Dudu's big stick");
        Item item3 = new Item(3,"isdaosdiapsdioas");

        Estoque estoque1 = new Estoque();

        estoque1.adicionarArray(item1);
        estoque1.adicionarArray(item2);
        estoque1.adicionarArray(item3);

        //estoque1.buscar(0);

//        System.out.println(estoque1.getItensArrayList());

//        System.out.println(Collections.max(estoque1.getItensArrayList()));
//        System.out.println(Collections.min(estoque1.getItensArrayList()));

//        Collections.sort(estoque1.getItensArrayList());

//        System.out.println(estoque1.getItensArrayList());

        System.out.println(estoque1.buscar2(item3));
    }

}