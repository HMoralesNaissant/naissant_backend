/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.PersonasRepositorio;
import com.naissant.naissantapp.Entity.Personas;
import com.naissant.naissantapp.Service.PersonasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasServiceImp implements PersonasService{
    @Autowired
    private PersonasRepositorio repositorio;
    
    @Override
    public List<Personas> listar() {
        return repositorio.findAll();
    }

    @Override
    public Personas listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Personas add(Personas p) {
        return repositorio.save(p);
    }

    @Override
    public Personas edit(Personas p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<Personas> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }
    
    @Override
    public List<Personas> listarByIdentificacion(Double identificacion) {
        return repositorio.findByIdentificacion(identificacion);
    }

    @Override
    public Personas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
