package br.com.lafaietesilva.organize.control;

import java.util.List;

public interface ICrud <T> {

    public  boolean  incluir(T obj);
    public  boolean  alterar(T obj);
    public  boolean  deletar(T obj);
    public List<T> listar();
}
