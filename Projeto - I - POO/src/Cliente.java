public class Cliente {
    String nome;
    long cpf;

    Computador[] computadores = new Computador[10];



    public float calculaTotalCompra(){
        int total=0;
        for (int i = 0; i < computadores.length ; i++) {
             total+=this.computadores[i].preco;
        }
        return total;
        }

    public Cliente(String nome, long cpf) {
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] == null){
            computadores[i] = new Computador();
        }
        }
        this.nome = nome;
        this.cpf = cpf;
    }
}
