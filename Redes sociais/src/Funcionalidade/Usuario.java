package Funcionalidade;

import Funcionalidade.RedeSocial;

public class Usuario {
    private String nome;
    private String email;
    RedeSocial[] redeSocials;

    public Usuario(RedeSocial[] redeSocials) {
        this.redeSocials = redeSocials;
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
