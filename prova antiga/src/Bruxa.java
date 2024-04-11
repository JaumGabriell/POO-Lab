public class Bruxa extends Monstro{
    Feitico feitico[];


    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
        feitico = new Feitico[5];
    }


    public boolean aprenderFeitico(String nome, int poder){
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] == null) {
                feitico[i] = new Feitico();
                feitico[i].setNome(nome);
                feitico[i].setPoder(poder);
                System.out.println("Feitico: " + feitico[i].getNome() + " com poder de: " + feitico[i].getPoder() + " aprendido" );
                return true;
            }
        }
        return false;

    }

    public void listarFeitcos(){
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null){
                System.out.println(feitico[i].getNome());
            }
        }
    }

    public void esquecerFeitco(int posicao){
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null){
                feitico[posicao] = null;
            }
        }
    }

    public void lancarFeiticoAlvo(Monstro monstroAlvo, int posicao){
        for (int i = 0; i < feitico.length; i++) {
            if (feitico[i] != null){
                System.out.println(feitico[posicao].getNome() + " lancado");
                monstroAlvo.setVida(monstroAlvo.getVida() - feitico[posicao].getPoder());
                super.setEnergia(getEnergia()-10);
                if(monstroAlvo.getVida() <= 0){
                    System.out.println("monstro atacado morreu");
                }
            }

        }

    }



}
