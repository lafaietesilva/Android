package br.com.lafaietesilva.organize.control;

import android.content.Context;
import android.util.Log;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datasource.AppDataBase;

public class UsuarioControl extends AppDataBase {


    public UsuarioControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"UsuarioControl: conectado");
    }
}
