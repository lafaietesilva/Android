package br.com.lafaietesilva.organize.Model;

import java.util.Date;

public class Saida {

    private String nome;//Nome da saida a ser efeutada
    private String categoria;//Categoria da saida a ser efetuada
    private String subCategoria;//SubCategoria da saida a ser efetuada
    private int valor;//Valor da saida
    private Date dataReal;//Data da efetivação da saida
    private Date dataPrev;//Data preveista da efetição da saida

    public Saida(String nome, String categoria, String subCategoria, int valor, Date dataReal, Date dataPrev) {
        this.nome = nome;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.valor = valor;
        this.dataReal = dataReal;
        this.dataPrev = dataPrev;
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

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getDataReal() {
        return dataReal;
    }

    public void setDataReal(Date dataReal) {
        this.dataReal = dataReal;
    }

    public Date getDataPrev() {
        return dataPrev;
    }

    public void setDataPrev(Date dataPrev) {
        this.dataPrev = dataPrev;
    }
}
