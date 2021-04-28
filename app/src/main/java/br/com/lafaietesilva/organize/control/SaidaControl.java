package br.com.lafaietesilva.organize.control;

import android.content.ContentValues;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.lafaietesilva.organize.datamodel.EntradaDataModel;
import br.com.lafaietesilva.organize.datamodel.SaidaDataModel;
import br.com.lafaietesilva.organize.datasource.AppDataBase;
import br.com.lafaietesilva.organize.model.Saida;

public class SaidaControl extends AppDataBase implements ICrud<Saida>{
    ContentValues dadosObj;

    public SaidaControl(Context context) {
        super(context);
    }


    @Override
    public boolean incluir(Saida obj) {

        dadosObj = new ContentValues();
        SimpleDateFormat dataPrev = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dataReal = new SimpleDateFormat("yyyy-MM-dd");

        dadosObj.put(SaidaDataModel.ID,obj.getId());
        dadosObj.put(SaidaDataModel.DESCRICAO,obj.getDescricao());
        dadosObj.put(SaidaDataModel.IDCART,obj.getIdCart());
        dadosObj.put(SaidaDataModel.CATEGORIA,obj.getCategoria());
        dadosObj.put(SaidaDataModel.SUBCATEGORIA,obj.getSubCategoria());
        dadosObj.put(SaidaDataModel.VALOR,obj.getValor());
        dadosObj.put(SaidaDataModel.DATAPREV,dataPrev.format(obj.getDataPrev()));
        dadosObj.put(SaidaDataModel.DATEREAL,dataReal.format(obj.getDataPrev()));



        return false;
    }

    @Override
    public boolean alterar(Saida obj) {
        return false;
    }

    @Override
    public boolean deletar(Saida obj) {
        return false;
    }

    @Override
    public List<Saida> listar() {
        return null;
    }
}
