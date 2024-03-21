import java.util.Arrays;

public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int nDeParticipantes;

    public void tocarMusica(int posicao){

    }

    public void tocarShow(){

    }

    public boolean adicionarMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null)
            {
                musicas[i] = musica;
                return true;
            }

        }
        return false;

    }

    public boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i]!= null)
            {
                if(musicas[i].getNome() == nome)
                {
                    return true;
                }
            }
        }
        return false;

    }

    public Banda( String nome, int nDeParticipantes) {
//        this.musicas = musicas;
        this.nome = nome;
        this.nDeParticipantes = nDeParticipantes;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "musicas=" + Arrays.toString(musicas) +
                ", nome='" + nome + '\'' +
                ", nDeParticipantes=" + nDeParticipantes +
                '}';
    }
}
