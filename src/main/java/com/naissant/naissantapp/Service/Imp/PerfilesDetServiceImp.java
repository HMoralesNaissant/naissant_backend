/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PerfilesDet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.PerfilesDetRepositorio;
import com.naissant.naissantapp.Service.PerfilesDetService;

@Service
public class PerfilesDetServiceImp implements PerfilesDetService{
    @Autowired
    private PerfilesDetRepositorio repositorio;
    
    @Override
    public List<PerfilesDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public PerfilesDet listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PerfilesDet add(PerfilesDet o) {
        return repositorio.save(o);
    }

    @Override
    public PerfilesDet edit(PerfilesDet o) {
        return repositorio.save(o);
    }
    
    @Override
    public List<PerfilesDet> listarByIdPerfiles(int id_perfiles) {
        return repositorio.findByPerfilesId_Id(id_perfiles);
    }

    @Override
    public PerfilesDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
