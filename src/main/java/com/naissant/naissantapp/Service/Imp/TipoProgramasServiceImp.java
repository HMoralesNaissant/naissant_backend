/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.TipoProgramasRepositorio;
import com.naissant.naissantapp.Entity.TipoProgramas;
import com.naissant.naissantapp.Service.TipoProgramasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProgramasServiceImp implements TipoProgramasService{
    @Autowired
    private TipoProgramasRepositorio repositorio;
    
    @Override
    public List<TipoProgramas> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoProgramas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TipoProgramas add(TipoProgramas t) {
        return repositorio.save(t);
    }

    @Override
    public TipoProgramas edit(TipoProgramas t) {
        return repositorio.save(t);
    }
    
    @Override
    public List<TipoProgramas> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public TipoProgramas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
