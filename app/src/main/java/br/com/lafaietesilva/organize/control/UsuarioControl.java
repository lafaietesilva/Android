package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.UsuarioDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Usuario;

public class UsuarioControl extends AppDataBase implements ICrud<Usuario>{

    ContentValues dadosObj;


    public UsuarioControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"UsuarioControl: conectado");
    }

    @Override
    public boolean incluir(Usuario obj) {
        dadosObj= new ContentValues();

//        dadosObj.put(UsuarioDataModel.ID,obj.getId());
        dadosObj.put(UsuarioDataModel.NOME,obj.getNome());
        dadosObj.put(UsuarioDataModel.EMAIL,obj.getEmail());
        dadosObj.put(UsuarioDataModel.SENHA,obj.getSenha());

        return insert(UsuarioDataModel.TABELA, dadosObj );
    }

    @Override
    public boolean alterar(Usuario obj) {
        dadosObj= new ContentValues();

        dadosObj.put(UsuarioDataModel.ID,obj.getId());
        dadosObj.put(UsuarioDataModel.NOME,obj.getNome());
        dadosObj.put(UsuarioDataModel.EMAIL,obj.getEmail());
        dadosObj.put(UsuarioDataModel.SENHA,obj.getSenha());

        return true;
    }

    @Override
    public boolean deletar(Usuario obj) {
        dadosObj= new ContentValues();

        dadosObj.put(UsuarioDataModel.ID,obj.getId());

        return true;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> listUsuario = new ArrayList<>();

        return listUsuario;
    }
}
