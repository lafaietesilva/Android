package br.com.lafaietesilva.organize.datamodel;

public class EntradaDataModel {

    public static final String TABELA = "entrada";

    public static final String ID = "id";
    public static final String IDCART = "idCart";
    public static final String DESCRICAO = "descricao";
    public static final String CATEGORIA = "categoria";
    public static final String SUBCATEGORIA = "subCategoria";
    public static final String VALOR = "valor";
    public static final String DATAPREV = "dataPrev";
    public static final String DATEREAL = "dataReal";

    public static String queryCriarTabela = "";

    public static String criarTabela() {
        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += IDCART + " integer, ";
        queryCriarTabela += DESCRICAO + " text, ";
        queryCriarTabela += CATEGORIA + " text, ";
        queryCriarTabela += SUBCATEGORIA + " text, ";
        queryCriarTabela += VALOR + " integer, ";
        queryCriarTabela += DATAPREV + " text, ";
        queryCriarTabela += DATEREAL + " text ";
        queryCriarTabela += ")";


        return queryCriarTabela;
    }
}