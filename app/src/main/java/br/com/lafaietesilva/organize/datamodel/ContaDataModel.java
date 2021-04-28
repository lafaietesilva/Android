package br.com.lafaietesilva.organize.datamodel;

public class ContaDataModel {

    public static final String TABELA = "conta";

    public static final String ID = "id";
    public static final String IDUSUARIO = "idUsuario";
    public static final String DESCRICAO = "descricao";
    public static final String TIPO = "tipo";
    public static final String SALDO = "saldo";

    public static String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += IDUSUARIO + " integer, ";
        queryCriarTabela += DESCRICAO + " text, ";
        queryCriarTabela += TIPO + " text, ";
        queryCriarTabela += SALDO + " integer ";
        queryCriarTabela += ")";


        return queryCriarTabela;
    }
}
