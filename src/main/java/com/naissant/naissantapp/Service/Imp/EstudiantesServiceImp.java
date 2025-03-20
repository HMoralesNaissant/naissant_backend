/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.EstudiantesRepositorio;
import com.naissant.naissantapp.Entity.Estudiantes;
import com.naissant.naissantapp.Service.EstudiantesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiantesServiceImp implements EstudiantesService{
    @Autowired
    private EstudiantesRepositorio repositorio;
    
    @Override
    public List<Estudiantes> listar() {
        return repositorio.findAll();
    }

    @Override
    public Estudiantes listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Estudiantes add(Estudiantes e) {
        return repositorio.save(e);
    }

    @Override
    public Estudiantes edit(Estudiantes e) {
        return repositorio.save(e);
    }
    
    @Override
    public List<Estudiantes> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public List<Estudiantes> listarByIdPrograma(int id_programa) {
        return repositorio.findByProgramaId_Id(id_programa);
    }
    
    @Override
    public List<Estudiantes> listarBySalutem(String salutem) {
        return repositorio.findBySalutem(salutem);
    }

    @Override
    public Estudiantes delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
