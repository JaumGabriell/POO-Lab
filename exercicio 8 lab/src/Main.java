public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1,"juju's sword");
        Estoque estoque1 = new Estoque();

        estoque1.adicionarArray(item1);

        System.out.println(estoque1.getItensArrayList());
    }
}