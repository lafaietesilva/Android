package br.com.lafaietesilva.organize.datamodel;

public class UsuarioDataModel {

    public static final String TABELA = "usuario";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";
    public static final String SENHA = "senha";

    public static String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += NOME + " text, ";
        queryCriarTabela += EMAIL + " text, ";
        queryCriarTabela += SENHA + " text ";
        queryCriarTabela += ")";


        return queryCriarTabela;
    }


}
