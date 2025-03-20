/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.EmpleadosRepositorio;
import com.naissant.naissantapp.Entity.Empleados;
import com.naissant.naissantapp.Service.EmpleadosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosServiceImp implements EmpleadosService{
    @Autowired
    private EmpleadosRepositorio repositorio;
    
    @Override
    public List<Empleados> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empleados listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Empleados add(Empleados e) {
        return repositorio.save(e);
    }

    @Override
    public Empleados edit(Empleados e) {
        return repositorio.save(e);
    }
    
    @Override
    public List<Empleados> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }
    
    @Override
    public Empleados delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
