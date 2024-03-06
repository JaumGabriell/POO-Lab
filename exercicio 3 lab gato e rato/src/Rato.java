public class Rato {
    float velocidade;
    boolean escondido;

    // escondendo o rato
    public void esconder(){
        System.out.println("O rato esta escondido!");
        escondido = true;
    }
    // rato procurando comida
    public void procurarComida(){

        escondido = false;
        System.out.println("O rato esta procurando comida!");

    }

    // informações do rato
    public String toString(){
        return "velocidade do rato: "+ velocidade + " o rato esta escondido? " + escondido;

    }

}

