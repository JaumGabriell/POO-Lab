import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // criando espadachim
        Espadachim espadachim1 = new Espadachim("juju","arroz",10);

        espadachim1.darOrdens();
        espadachim1.mudarRota();

        // criando capitao
        Capitao capitao1 = new Capitao("gaga","feijao",7,20);

        capitao1.darOrdens();
        capitao1.mudarRota();
        capitao1.conquistarNovoSeguidor(espadachim1);

        // criando receita
        Receita receita1 = new Receita();
        receita1.setNome("arroz");
        receita1.setDificuldade(3);

        // criando cozinheiro
        Cozinheiro cozinheiro1 = new Cozinheiro("ruru","frango",4);
        cozinheiro1.adcionarReceita(receita1);
        cozinheiro1.prepararPrato(0);
        cozinheiro1.mostrarReceitas();




    }
}