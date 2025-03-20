/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PacientesNoinscritos;
import com.naissant.naissantapp.Repository.PacientesNoinscritosRepositorio;
import com.naissant.naissantapp.Service.PacientesNoinscritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesNoinscritosServiceImp implements PacientesNoinscritosService {
    @Autowired
    private PacientesNoinscritosRepositorio repositorio;
    
    @Override
    public List<PacientesNoinscritos> listar() {
        return repositorio.findAll();
    }

    @Override
    public PacientesNoinscritos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public PacientesNoinscritos add(PacientesNoinscritos p) {
        return repositorio.save(p);
    }

    @Override
    public PacientesNoinscritos edit(PacientesNoinscritos p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<PacientesNoinscritos> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }

    @Override
    public List<PacientesNoinscritos> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }
    
    @Override
    public PacientesNoinscritos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
