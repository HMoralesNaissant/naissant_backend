/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EstudiantesClinicaOdo;
import com.naissant.naissantapp.Repository.EstudiantesClinicaOdoRepositorio;
import com.naissant.naissantapp.Service.EstudiantesClinicaOdoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesClinicaOdoServiceImp implements EstudiantesClinicaOdoService {
    @Autowired
    private EstudiantesClinicaOdoRepositorio repositorio;
    
    @Override
    public List<EstudiantesClinicaOdo> listar() {
        return repositorio.findAll();
    }

    @Override
    public EstudiantesClinicaOdo listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public EstudiantesClinicaOdo add(EstudiantesClinicaOdo u) {
        return repositorio.save(u);
    }

    @Override
    public EstudiantesClinicaOdo edit(EstudiantesClinicaOdo u) {
        return repositorio.save(u);
    }
    
    @Override
    public List<EstudiantesClinicaOdo> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public List<EstudiantesClinicaOdo> listarByIdPrograma(int id_programa) {
        return repositorio.findByProgramaId_Id(id_programa);
    }
    
    @Override
    public EstudiantesClinicaOdo delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
