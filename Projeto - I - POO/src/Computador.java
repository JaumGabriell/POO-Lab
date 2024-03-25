public class Computador {

    String marca;
    float preco;

    SistemaOperacional system;

    HardwareBasico[] HB = new HardwareBasico[10];

    MemoriaUSB memoriaUSB;



    public Computador() {
        this.system = new SistemaOperacional();
        this.HB[0] = new HardwareBasico();
        this.HB[1] = new HardwareBasico();
        this.HB[2] = new HardwareBasico();
    }

    public void mostraPCConfings(){
        System.out.println(marca);
        System.out.println(preco);
        System.out.println(this.memoriaUSB.nome);
        System.out.println(this.memoriaUSB.capacidade);
        System.out.println(this.system.nome);
        System.out.println(this.system.tipo);

        for (int i = 0; i < HB.length; i++) {
            if(this.HB[i] != null) {
                System.out.println(this.HB[i].nome);
                System.out.println(this.HB[i].capacidade);
            }
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb){

        memoriaUSB = musb;

    }

}
