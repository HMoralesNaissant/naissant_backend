/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.entity.Visitas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.repository.VisitasRepositorio;
import com.naissant.naissantapp.service.VisitasService;

@Service
public class VisitasServiceImp implements VisitasService{
    @Autowired
    private VisitasRepositorio repositorio;
    
    @Override
    public List<Visitas> listar() {
        return repositorio.findAll();
    }

    @Override
    public Visitas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Visitas add(Visitas v) {
        return repositorio.save(Audit.created(v));
    }

    @Override
    public Visitas edit(Visitas v) {
        return repositorio.save(Audit.updated(v));
    }
    
    @Override
    public List<Visitas> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public List<Visitas> listarByIdArea(int id_area) {
        return repositorio.findByAreaId_Id(id_area);
    }
    
    @Override
    public Visitas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
