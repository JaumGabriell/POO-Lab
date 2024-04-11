public class Notebook extends Produto{
    private String processador;
    private String memoria;

    public Notebook(double valor, String nome, String processador, String memoria) {
        super(valor, nome);
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void instalarAplicativo(){
        System.out.println("Instalando...");

    }

    public void mostrarInfo(){
        super.mostraInfo();
        System.out.println("processador: "+ processador + "memoria: " + memoria);

    }
}
