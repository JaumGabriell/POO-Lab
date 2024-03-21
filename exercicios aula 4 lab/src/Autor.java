public class Autor {
    private String nome;

    private Saga[] sagas = new Saga[10];

    public Autor(String nome, Saga[] sagas) {
        this.nome = nome;
        this.sagas = sagas;
    }

    public void listarSaga (){
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] != null){
                sagas[i].listarLivros();
            }
        }
    }

    public void adicionarSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null){
                sagas[i] = saga;
                break;
            }

        }
    }


}
