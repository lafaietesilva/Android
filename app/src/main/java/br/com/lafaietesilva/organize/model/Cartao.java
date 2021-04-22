package br.com.lafaietesilva.organize.model;

public class Cartao {

    private int id;
    private int idConta;
    private String descricao;
    private int limite;
    private int custo;
    private int saldo;

    public Cartao(int id, int idConta, String descricao, int limite, int custo, int saldo) {
        this.id = id;
        this.idConta = idConta;
        this.descricao = descricao;
        this.limite = limite;
        this.custo = custo;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
