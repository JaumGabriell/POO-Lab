package Apps;

import Funcionalidade.RedeSocial;
import Interface.Compartilhamento;
import Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {
    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video conferencia no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando videos no GooglePlus");

    }
}
