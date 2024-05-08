public class Item {
    private int valor;
    private String nome;

    public Item(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "valor=" + valor +
                ", nome='" + nome + '\'' +
                '}';
    }


}
