/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.ModulosRepositorio;
import com.naissant.naissantapp.Entity.Modulos;
import com.naissant.naissantapp.Service.ModulosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModulosServiceImp implements ModulosService{
    @Autowired
    private ModulosRepositorio repositorio;
    
    @Override
    public List<Modulos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Modulos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Modulos add(Modulos m) {
        return repositorio.save(m);
    }

    @Override
    public Modulos edit(Modulos m) {
        return repositorio.save(m);
    }
    
    @Override
    public List<Modulos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Modulos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
