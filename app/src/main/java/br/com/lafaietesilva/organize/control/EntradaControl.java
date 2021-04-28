package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.lafaietesilva.organize.api.ApiUtil;
import br.com.lafaietesilva.organize.datamodel.EntradaDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Entrada;

public class EntradaControl extends AppDataBase implements ICrud<Entrada>{
    ContentValues dadosObj;

    public EntradaControl(Context context) {
        super(context);

        Log.d(ApiUtil.TAG,"EntradaControl: conectado");
    }


    @Override
    public boolean incluir(Entrada obj) {
        dadosObj = new ContentValues();
        SimpleDateFormat dataPrev = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dataReal = new SimpleDateFormat("yyyy-MM-dd");

        dadosObj.put(EntradaDataModel.ID,obj.getId());
        dadosObj.put(EntradaDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(EntradaDataModel.IDCART,obj.getIdCart());
        dadosObj.put(EntradaDataModel.CATEGORIA,obj.getCategoria());
        dadosObj.put(EntradaDataModel.SUBCATEGORIA,obj.getSubCategoria());
        dadosObj.put(EntradaDataModel.VALOR,obj.getValor());
        dadosObj.put(EntradaDataModel.DATAPREV,dataPrev.format(obj.getDataPrev()));
        dadosObj.put(EntradaDataModel.DATEREAL,dataReal.format(obj.getDataPrev()));



        return false;
    }

    @Override
    public boolean alterar(Entrada obj) {
        return false;
    }

    @Override
    public boolean deletar(Entrada obj) {
        return false;
    }

    @Override
    public List<Entrada> listar() {
        return null;
    }
}
