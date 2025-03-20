/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.PerfilesRepositorio;
import com.naissant.naissantapp.Entity.Perfiles;
import com.naissant.naissantapp.Service.PerfilesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilesServiceImp implements PerfilesService{
    @Autowired
    private PerfilesRepositorio repositorio;
    
    @Override
    public List<Perfiles> listar() {
        return repositorio.findAll();
    }

    @Override
    public Perfiles listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Perfiles add(Perfiles p) {
        return repositorio.save(p);
    }

    @Override
    public Perfiles edit(Perfiles p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<Perfiles> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }
    
    @Override
    public List<Perfiles> listarByNombre(String nombre) {
        return repositorio.findByNombre(nombre);
    }

    @Override
    public void delete(int id) {
        repositorio.deleteById(id);
    }
}
