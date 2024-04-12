public class Robo {
    private int energia;
    private String nome;
    private int totalDeRobos;
    private int energiaMaxima;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public Robo(int energia, String nome, int totalDeRobos, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.totalDeRobos = totalDeRobos;
        this.energiaMaxima = energiaMaxima;
    }

    public void trabalhar(){
        this.energia -= 10; // reduzindo energia
    }

    public void trocarEnergia(Robo alvo){
        if(this.getEnergia()>0){
            if (alvo.getEnergia() <= alvo.getEnergiaMaxima()) {
                alvo.setEnergia(alvo.getEnergia() + 5);
                this.setEnergia(this.getEnergia() - 5);
            }else {
                System.out.println("energia maxima atingida");
            }
        }
    }

    public void recarregar(int horas){
        for (int i = 0; i < horas; i++) {
            if(this.getEnergia() < this.getEnergiaMaxima()) {
                this.setEnergia(getEnergia() + 10);
                System.out.println("carregamento em andamento");
                if(this.getEnergia() == this.getEnergiaMaxima()){
                    System.out.println("carregamento completo");
                    break;
                }
            }else {
                System.out.println("energia maxima ja atingida");
            }
        }

    }



}
