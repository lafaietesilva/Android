package br.com.lafaietesilva.organize.datamodel;

public class CarteiraDataModel {

    public static final String TABELA = "carteira";

    public static final String ID = "id";
    public static final String IDCONTA = "idConta";
    public static final String DESCRICAO = "descricao";
    public static final String ENTRADA = "entrada";
    public static final String SAIDA = "saida";

    public static String queryCriarTabela = "";

    public static String criarTabela() {
        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += IDCONTA + " integer, ";
        queryCriarTabela += DESCRICAO + " text, ";
        queryCriarTabela += ENTRADA + " integer, ";
        queryCriarTabela += SAIDA + " integer ";
        queryCriarTabela += ")";


        return queryCriarTabela;
    }
}