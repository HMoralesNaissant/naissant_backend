/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Reportados;
import com.naissant.naissantapp.Repository.ReportadosRepositorio;
import com.naissant.naissantapp.Service.ReportadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportadosServiceImp implements ReportadosService {
    @Autowired
    private ReportadosRepositorio repositorio;
    
    @Override
    public List<Reportados> listar() {
        return repositorio.findAll();
    }

    @Override
    public Reportados listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Reportados add(Reportados r) {
        return repositorio.save(r);
    }

    @Override
    public Reportados edit(Reportados r) {
        return repositorio.save(r);
    }
    
    @Override
    public List<Reportados> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public Reportados delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
