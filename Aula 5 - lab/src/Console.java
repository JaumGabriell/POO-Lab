public class Console extends Produto{
    private String geração;
    private String marca;

    public Console(double valor, String nome, String geração, String marca) {
        super(valor, nome);
        this.geração = geração;
        this.marca = marca;
    }

    public Console(double valor, String nome) {
        super(valor, nome);
    }

    public String getGeração() {
        return geração;
    }

    public void setGeração(String geração) {
        this.geração = geração;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void jogar(){
        System.out.println("Jogando!!");

    }

    public void mostrarInfo(){
        super.mostraInfo();
        System.out.println("geração: "+ geração + "marca: " + marca);

    }
}
