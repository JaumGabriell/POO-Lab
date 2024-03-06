public class Aluno {
    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    public int calculaMedia(){
        return (this.np1+this.np2)/2;

    }

    public int calculaNP3(int media){
        int n; // nota da np3
        n = (calculaMedia()+media)/2;
        return n;

    }

    public String toString(){
        return "nome "+ nome + " perdio " + periodo + " matricula " + matricula;

       }


}
