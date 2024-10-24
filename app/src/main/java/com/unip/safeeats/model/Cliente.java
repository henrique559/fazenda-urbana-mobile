package com.unip.safeeats.model;

import java.util.Date;

public class Cliente extends Usuario{
    private int cpfCliente;
    private String rgCliente;
    private Endereco enderecoUsuario;
    private Date dataNascimento;

    public Cliente(String nomeUsuario, String emailUsuario, String loginUsuario, String senhaUsuario, Endereco enderecoUsuario, Date dataNascimento) {
        super(nomeUsuario, emailUsuario, loginUsuario, senhaUsuario);
        this.enderecoUsuario = enderecoUsuario;
        this.dataNascimento = dataNascimento;
    }


    public Endereco getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(Endereco enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
