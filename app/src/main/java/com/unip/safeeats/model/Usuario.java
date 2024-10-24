package com.unip.safeeats.model;

public class Usuario {
    private String nomeUsuario;
    private String emailUsuario;
    private String loginUsuario;
    private String senhaUsuario;


    public Usuario(String nomeUsuario, String emailUsuario, String loginUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }


    // Getter's e Setter's
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public void cadastraUsuario(){
        // TODO: Chamar control de cadastro de usuário
    }
    public void loginUsuario(){
        // TODO: Chamar control de login de usuário
    }
    public void atualizarUsuario(){
        // TODO: Chamar control de atualização de dados de usuário

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", emailUsuario='" + emailUsuario + '\'' +
                ", loginUsuario='" + loginUsuario + '\'' +
                ", senhaUsuario='" + senhaUsuario + '\'' +
                '}';
    }
}
