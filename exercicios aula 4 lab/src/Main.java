public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Nome do Vento",767 );
        Livro livro2 = new Livro("O Temor do Sabio",1000 );
        Livro livro3 = new Livro("A Musica do Silencio",304 );

        Livro[] livrosSaga1 = {livro1,livro2,livro3};

        Saga saga1 = new Saga(10,livrosSaga1);

        Saga[] sagasSaga1 = {saga1};

        Autor autor1 = new Autor("Patrick Rothfuss",sagasSaga1);

        autor1.adicionarSaga(saga1);

        autor1.listarSaga();
    }
}