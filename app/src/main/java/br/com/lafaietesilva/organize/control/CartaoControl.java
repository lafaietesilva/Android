package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.CartaoDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Cartao;
import br.com.lafaietesilva.organize.model.Usuario;

public class CartaoControl extends AppDataBase implements ICrud<Cartao> {

    ContentValues dadosObj;


    public CartaoControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"CartaoControl: conectado");
    }


    @Override
    public boolean incluir(Cartao obj) {

        dadosObj = new ContentValues();

//        dadosObj.put(CartaoDataModel.ID, obj.getId());
        dadosObj.put(CartaoDataModel.DESCRICAO, obj.getDescricao());
        dadosObj.put(CartaoDataModel.IDCONTA, obj.getIdConta());
        dadosObj.put(CartaoDataModel.LIMITE, obj.getLimite());
        dadosObj.put(CartaoDataModel.SALDO, obj.getSaldo());
        dadosObj.put(CartaoDataModel.CUSTO, obj.getCusto());

        return false;
    }

    @Override
    public boolean alterar(Cartao obj) {

        dadosObj = new ContentValues();

        dadosObj.put(CartaoDataModel.ID, obj.getId());
        dadosObj.put(CartaoDataModel.DESCRICAO, obj.getDescricao());
        dadosObj.put(CartaoDataModel.IDCONTA, obj.getIdConta());
        dadosObj.put(CartaoDataModel.LIMITE, obj.getLimite());
        dadosObj.put(CartaoDataModel.SALDO, obj.getSaldo());
        dadosObj.put(CartaoDataModel.CUSTO, obj.getCusto());

        return false;
    }

    @Override
    public boolean deletar(Cartao obj) {

        dadosObj = new ContentValues();

        dadosObj.put(CartaoDataModel.ID, obj.getId());

        return false;
    }

    @Override
    public List<Cartao> listar() {
        List<Cartao> listCartao = new ArrayList<>();
        return listCartao;
    }
}
