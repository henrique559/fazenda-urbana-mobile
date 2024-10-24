package com.unip.safeeats.model;

public class Administrador extends Usuario {

    private String cpfAdmin;
    private String numRegistro;

    public Administrador(String nomeUsuario, String emailUsuario, String loginUsuario, String senhaUsuario) {
        super(nomeUsuario, emailUsuario, loginUsuario, senhaUsuario);


    }
}
