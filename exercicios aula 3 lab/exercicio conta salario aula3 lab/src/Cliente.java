public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }


    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public boolean sacarDinheiro(double valor){
        if(getConta().getSaldo()>=valor){
            System.out.println("Saldo realizado com sucesso");
            return true;
        }else {
            System.out.println("Saldo insuficiente");
            return false;
        }

    }

    public void depositarDinheiro(double valor){
        if(this.conta.getSaldo()<this.conta.getLimite()){
            this.conta.setSaldo(valor);
        }
    }
    public boolean comprarComCredito(double valor){
        if(this.conta.getSaldo() >= valor && this.conta.getLimite() >= valor){
            System.out.println("Compra com credito realizado com sucesso");
            return true;
        }else {
            System.out.println("Sem credito suficiente");
            return false;
        }

    }

    public boolean transferir(Conta contaParaReceber){
        if(conta.getSaldo()<= contaParaReceber.getLimite()){
            System.out.println("Transferencia realizado com sucesso");
            return true;
        }else {
            System.out.println("Nao foi possivel transferir");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", conta=" + conta +
                '}';
    }

    Cliente(String nome,String cpf, double saldo, double limite){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = new Conta(saldo,limite);

    }
}
