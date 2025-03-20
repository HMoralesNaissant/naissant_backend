/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.TipoProductosRepositorio;
import com.naissant.naissantapp.Entity.TipoProductos;
import com.naissant.naissantapp.Service.TipoProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProductosServiceImp implements TipoProductosService{
    @Autowired
    private TipoProductosRepositorio repositorio;
    
    @Override
    public List<TipoProductos> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoProductos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TipoProductos add(TipoProductos t) {
        return repositorio.save(t);
    }

    @Override
    public TipoProductos edit(TipoProductos t) {
        return repositorio.save(t);
    }
    
    @Override
    public List<TipoProductos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public TipoProductos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
