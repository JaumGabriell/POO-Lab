public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta = new Conta();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente(){
        this.conta = new Conta();
    }

    boolean sacarDinheiro(double valor){
        if(this.conta.getSaldo() >= valor){
         return true;
        }
        else {
            return false;
        }
    }

    double depositarDinheiro(double valor){

        if(this.conta.getSaldo()<this.conta.getLimite()) {
            valor += this.conta.getSaldo() ;
            this.conta.setSaldo(valor);
        }

        return this.conta.getSaldo();
    }

    boolean comprarComCredito(double valor){
        if(this.conta.getSaldo() >= valor){
            return true;
        }
        else {
            return false;
        }

    }

    boolean transferir(Conta contaParaReceber, double valor){
        valor+=contaParaReceber.getSaldo();

        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo='" + this.conta.getSaldo() + '\'' +
                ", limite='" + this.conta.getLimite() +
                '}';
    }
}
