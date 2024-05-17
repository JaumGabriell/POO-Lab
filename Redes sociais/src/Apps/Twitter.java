package Apps;

import Funcionalidade.RedeSocial;
import Interface.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou fotos no Twitter!");
    }
}
