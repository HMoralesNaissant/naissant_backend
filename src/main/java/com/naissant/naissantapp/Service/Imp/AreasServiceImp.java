/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.AreasRepositorio;
import com.naissant.naissantapp.Entity.Areas;
import com.naissant.naissantapp.Service.AreasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreasServiceImp implements AreasService{
    @Autowired
    private AreasRepositorio repositorio;
    
    @Override
    public List<Areas> listar() {
        return repositorio.findAll();
    }

    @Override
    public Areas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Areas add(Areas a) {
        return repositorio.save(a);
    }

    @Override
    public Areas edit(Areas a) {
        return repositorio.save(a);
    }
    
    @Override
    public List<Areas> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Areas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
