/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.CargosRepositorio;
import com.naissant.naissantapp.Entity.Cargos;
import com.naissant.naissantapp.Service.CargosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosServiceImp implements CargosService{
    @Autowired
    private CargosRepositorio repositorio;
    
    @Override
    public List<Cargos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cargos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Cargos add(Cargos c) {
        return repositorio.save(c);
    }

    @Override
    public Cargos edit(Cargos c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<Cargos> listarByIdAreas(int id_areas) {
        return repositorio.findByAreasId_Id(id_areas);
    }

    @Override
    public Cargos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
