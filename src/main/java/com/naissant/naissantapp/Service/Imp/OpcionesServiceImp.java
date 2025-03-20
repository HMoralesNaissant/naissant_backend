/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.OpcionesRepositorio;
import com.naissant.naissantapp.Entity.Opciones;
import com.naissant.naissantapp.Service.OpcionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpcionesServiceImp implements OpcionesService{
    @Autowired
    private OpcionesRepositorio repositorio;
    
    @Override
    public List<Opciones> listar() {
        return repositorio.findAll();
    }

    @Override
    public Opciones listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Opciones add(Opciones o) {
        return repositorio.save(o);
    }

    @Override
    public Opciones edit(Opciones o) {
        return repositorio.save(o);
    }
    
    @Override
    public List<Opciones> listarByIdModulo(int id_modulo) {
        return repositorio.findByModuloId_Id(id_modulo);
    }

    @Override
    public Opciones delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
