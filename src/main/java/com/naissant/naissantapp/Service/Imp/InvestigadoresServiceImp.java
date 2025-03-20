/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.InvestigadoresRepositorio;
import com.naissant.naissantapp.Entity.Investigadores;
import com.naissant.naissantapp.Service.InvestigadoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestigadoresServiceImp implements InvestigadoresService{
    @Autowired
    private InvestigadoresRepositorio repositorio;
    
    @Override
    public List<Investigadores> listar() {
        return repositorio.findAll();
    }

    @Override
    public Investigadores listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Investigadores add(Investigadores i) {
        return repositorio.save(i);
    }

    @Override
    public Investigadores edit(Investigadores i) {
        return repositorio.save(i);
    }
    
    @Override
    public List<Investigadores> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public Investigadores delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
