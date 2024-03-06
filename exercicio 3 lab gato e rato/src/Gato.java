public class Gato {
    String cor;
    int idade;
    int velocidade;

    // o gato esta brincando
    public void brincar(){

        System.out.println("Gato esta brincando!");

    }
    // o gato esta caçando
    public void caçar(Rato rato){

        if(this.velocidade > rato.velocidade)
        {
            System.out.println("O gato pegou o rato!");
        }else {
            System.out.println("O gato nao pegou o rato!");
        }

    }
    // mostrando informações do gato
    public String toString()
    {
        return "Cor do gato: " + cor + " Idade do gato: " + idade + " Velocidade do gato: " + velocidade;

    }

}


