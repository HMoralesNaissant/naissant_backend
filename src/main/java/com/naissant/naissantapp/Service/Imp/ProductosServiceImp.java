/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.ProductosRepositorio;
import com.naissant.naissantapp.Entity.Productos;
import com.naissant.naissantapp.Service.ProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImp implements ProductosService{
    @Autowired
    private ProductosRepositorio repositorio;
    
    @Override
    public List<Productos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Productos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Productos add(Productos p) {
        return repositorio.save(p);
    }

    @Override
    public Productos edit(Productos p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<Productos> listarByIdTipo(int id_tipo) {
        return repositorio.findByTipoId_Id(id_tipo);
    }

    @Override
    public Productos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
