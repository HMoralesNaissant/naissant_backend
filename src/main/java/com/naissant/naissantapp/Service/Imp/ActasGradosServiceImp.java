/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 * */

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.ActasGradosRepositorio;
import com.naissant.naissantapp.Entity.ActasGrados;
import com.naissant.naissantapp.Service.ActasGradosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActasGradosServiceImp implements ActasGradosService {

    @Autowired
    private ActasGradosRepositorio repositorio;

    @Override
    public List<ActasGrados> listar() {
        return repositorio.findAll();
    }

    @Override
    public ActasGrados listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ActasGrados add(ActasGrados a) {
        return repositorio.save(a);
    }

    @Override
    public ActasGrados edit(ActasGrados a) {
        return repositorio.save(a);
    }

    @Override
    public List<ActasGrados> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }
    
    @Override
    public ActasGrados delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

}
