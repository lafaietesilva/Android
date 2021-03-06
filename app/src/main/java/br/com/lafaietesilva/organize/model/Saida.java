package br.com.lafaietesilva.organize.model;

import java.util.Date;

import br.com.lafaietesilva.organize.control.ICrud;

public class Saida{

    private int id;
    private int idCart;
    private String descricao;//Nome da saida a ser efeutada
    private String categoria;//Categoria da saida a ser efetuada
    private String subCategoria;//SubCategoria da saida a ser efetuada
    private int valor;//Valor da saida
    private Date dataPrev;//Data preveista da efetição da saida
    private Date dataReal;//Data da efetivação da saida

    public Saida(int id, int idCart, String descricao, String categoria, String subCategoria, int valor, Date dataPrev, Date dataReal) {
        this.id = id;
        this.idCart = idCart;
        this.descricao = descricao;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.valor = valor;
        this.dataPrev = dataPrev;
        this.dataReal = dataReal;
    }

    public Saida(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public Date getDataPrev() {
        return dataPrev;
    }

    public void setDataPrev(Date dataPrev) {
        this.dataPrev = dataPrev;
    }

    public Date getDataReal() {
        return dataReal;
    }

    public void setDataReal(Date dataReal) {
        this.dataReal = dataReal;
    }

}
