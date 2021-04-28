package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.ContaDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Conta;

public class ContaControl extends AppDataBase implements ICrud<Conta> {

    ContentValues dadosObj;

    public ContaControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"ContaControl: conectado");

    }

    @Override
    public boolean incluir(Conta obj) {

        dadosObj = new ContentValues();

//        dadosObj.put(ContaDataModel.ID,obj.getId());
        dadosObj.put(ContaDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(ContaDataModel.IDUSUARIO,obj.getIdUsuario());
        dadosObj.put(ContaDataModel.TIPO,obj.getTipo());
        dadosObj.put(ContaDataModel.SALDO,obj.getSaldo());

        return false;
    }

    @Override
    public boolean alterar(Conta obj) {
        dadosObj = new ContentValues();

        dadosObj.put(ContaDataModel.ID,obj.getId());
        dadosObj.put(ContaDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(ContaDataModel.IDUSUARIO,obj.getIdUsuario());
        dadosObj.put(ContaDataModel.TIPO,obj.getTipo());
        dadosObj.put(ContaDataModel.SALDO,obj.getSaldo());


        return false;
    }

    @Override
    public boolean deletar(Conta obj) {
        dadosObj = new ContentValues();

        dadosObj.put(ContaDataModel.ID,obj.getId());


        return false;
    }

    @Override
    public List<Conta> listar() {
        List<Conta> listConta = new ArrayList<>();

        return listConta;
    }
}
