package br.com.lafaietesilva.organize.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.CartaoDataModel;
import br.com.lafaietesilva.organize.datamodel.CarteiraDataModel;
import br.com.lafaietesilva.organize.datamodel.ContaDataModel;
import br.com.lafaietesilva.organize.datamodel.EntradaDataModel;
import br.com.lafaietesilva.organize.datamodel.SaidaDataModel;
import br.com.lafaietesilva.organize.datamodel.UsuarioDataModel;
import br.com.lafaietesilva.organize.model.Carteira;
import br.com.lafaietesilva.organize.model.Usuario;


public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "Organize.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(ApiUtil.TAG,"AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UsuarioDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Usuario " + UsuarioDataModel.criarTabela());

        db.execSQL(ContaDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Conta " + ContaDataModel.criarTabela());

        db.execSQL(CarteiraDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Carteira " + CarteiraDataModel.criarTabela());

        db.execSQL(CartaoDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Cartao " + CartaoDataModel.criarTabela());

        db.execSQL(EntradaDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Entrada " + EntradaDataModel.criarTabela());

        db.execSQL(SaidaDataModel.criarTabela());

        Log.d(ApiUtil.TAG,"onCreate: tabela Siada " + SaidaDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        }

    public boolean insert(String tabela, ContentValues dadosObj){
        db = getWritableDatabase();

        boolean ret = false;

        try{
            ret = db.insert(tabela,null,dadosObj) > 0;
        }catch (Exception e){
            Log.d(ApiUtil.TAG,"insert: " + e.getMessage());
        }

        return ret;

    }
}
