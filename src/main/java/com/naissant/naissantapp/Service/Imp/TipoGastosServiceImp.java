/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.TipoGastosRepositorio;
import com.naissant.naissantapp.Entity.TipoGastos;
import com.naissant.naissantapp.Service.TipoGastosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoGastosServiceImp implements TipoGastosService{
    @Autowired
    private TipoGastosRepositorio repositorio;
    
    @Override
    public List<TipoGastos> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoGastos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TipoGastos add(TipoGastos t) {
        return repositorio.save(t);
    }

    @Override
    public TipoGastos edit(TipoGastos t) {
        return repositorio.save(t);
    }
    
    @Override
    public List<TipoGastos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public TipoGastos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
