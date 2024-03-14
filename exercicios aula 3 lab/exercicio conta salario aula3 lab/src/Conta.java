public class Conta {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + this.saldo +
                ", limite=" + this.limite +
                '}';
    }

    Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
}
