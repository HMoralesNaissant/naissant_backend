/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Pacientes;
import com.naissant.naissantapp.Repository.PacientesRepositorio;
import com.naissant.naissantapp.Service.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesServiceImp implements PacientesService {
    @Autowired
    private PacientesRepositorio repositorio;
    
    @Override
    public List<Pacientes> listar() {
        return repositorio.findAll();
    }

    @Override
    public Pacientes listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Pacientes add(Pacientes p) {
        return repositorio.save(p);
    }

    @Override
    public Pacientes edit(Pacientes p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<Pacientes> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }

    @Override
    public List<Pacientes> listarByIdEstudianteInscribe(int id_estudiante_inscribe) {
        return repositorio.findByEstudianteInscribeId_Id(id_estudiante_inscribe);
    }
    
    @Override
    public Pacientes delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
