package br.com.lafaietesilva.organize.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import br.com.lafaietesilva.organize.api.ApiUtil;


public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "Organize.sqlite";
    public static final int DB_VERSION = 1;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(ApiUtil.TAG,"AppDataBase: Criando Banco de Dados");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
