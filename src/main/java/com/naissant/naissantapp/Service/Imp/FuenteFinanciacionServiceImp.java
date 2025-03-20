/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.FuenteFinanciacionRepositorio;
import com.naissant.naissantapp.Entity.FuenteFinanciacion;
import com.naissant.naissantapp.Service.FuenteFinanciacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuenteFinanciacionServiceImp implements FuenteFinanciacionService{
    @Autowired
    private FuenteFinanciacionRepositorio repositorio;
    
    @Override
    public List<FuenteFinanciacion> listar() {
        return repositorio.findAll();
    }

    @Override
    public FuenteFinanciacion listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public FuenteFinanciacion add(FuenteFinanciacion f) {
        return repositorio.save(f);
    }

    @Override
    public FuenteFinanciacion edit(FuenteFinanciacion f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<FuenteFinanciacion> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public FuenteFinanciacion delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
