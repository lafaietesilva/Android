package br.com.lafaietesilva.organize.datamodel;

public class CartaoDataModel {

    public static final String TABELA = "cartao";

    public static final String ID = "id";
    public static final String IDCONTA = "idConta";
    public static final String DESCRICAO = "descricao";
    public static final String LIMITE = "limite";
    public static final String CUSTO = "custo";
    public static final String SALDO = "saldo";

    public static String queryCriarTabela = "";

    public static String criarTabela() {
        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += IDCONTA + " integer, ";
        queryCriarTabela += DESCRICAO + " text, ";
        queryCriarTabela += LIMITE + " integer, ";
        queryCriarTabela += CUSTO + " integer, ";
        queryCriarTabela += SALDO + " integer ";
        queryCriarTabela += ")";


        return queryCriarTabela;
    }
}