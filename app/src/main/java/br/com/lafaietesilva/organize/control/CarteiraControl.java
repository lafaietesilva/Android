package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.CartaoDataModel;
import br.com.lafaietesilva.organize.datamodel.CarteiraDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Carteira;

public class CarteiraControl extends AppDataBase implements ICrud<Carteira> {

    ContentValues dadosObj;


    public CarteiraControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"CarteiraControl: conectado");
    }


    @Override
    public boolean incluir(Carteira obj) {
        dadosObj = new ContentValues();

//        dadosObj.put(CarteiraDataModel.ID,obj.getId());
        dadosObj.put(CarteiraDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(CarteiraDataModel.IDCONTA,obj.getIdConta());
        dadosObj.put(CarteiraDataModel.ENTRADA,obj.getEntrada());
        dadosObj.put(CarteiraDataModel.SAIDA,obj.getSaida());

        return false;
    }

    @Override
    public boolean alterar(Carteira obj) {
        dadosObj = new ContentValues();

        dadosObj.put(CarteiraDataModel.ID,obj.getId());
        dadosObj.put(CarteiraDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(CarteiraDataModel.IDCONTA,obj.getIdConta());
        dadosObj.put(CarteiraDataModel.ENTRADA,obj.getEntrada());
        dadosObj.put(CarteiraDataModel.SAIDA,obj.getSaida());

        return false;
    }

    @Override
    public boolean deletar(Carteira obj) {
        dadosObj = new ContentValues();

        dadosObj.put(CarteiraDataModel.ID,obj.getId());


        return false;
    }

    @Override
    public List<Carteira> listar() {
        List<Carteira> listCateira = new ArrayList<>();

        return listCateira;
    }
}
