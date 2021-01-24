package br.com.lafaietesilva.organize.Model;

import java.util.Date;

public class Entrada {

    private String nome;
    private String categoria;
    private String tipo;
    private Date data;
    private int valor;

    public Entrada(String categoria, String tipo, Date data, int valor) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
