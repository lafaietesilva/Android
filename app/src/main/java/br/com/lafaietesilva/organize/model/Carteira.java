package br.com.lafaietesilva.organize.model;

import br.com.lafaietesilva.organize.control.ICrud;

public class Carteira{

    private int id;
    private int idConta;
    private String descricao;
    private int entrada;
    private int saida;

    public Carteira(int id, int idConta, String descricao, int entrada, int saida) {
        this.id = id;
        this.idConta = idConta;
        this.descricao = descricao;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Carteira(){

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

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

}
