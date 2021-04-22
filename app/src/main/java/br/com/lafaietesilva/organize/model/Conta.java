package br.com.lafaietesilva.organize.model;

public class Conta {

    private int id;
    private int idUsuario;
    private String descricao;
    private String tipo;
    private int saldo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Conta(int id, int idUsuario, String descricao, String tipo, int saldo) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.descricao = descricao;
        this.tipo = tipo;
        this.saldo = saldo;
    }
}
