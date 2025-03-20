/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Franquicias;
import com.naissant.naissantapp.Repository.FranquiciasRepositorio;
import com.naissant.naissantapp.Service.FranquiciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FranquiciasServiceImp implements FranquiciasService {
    @Autowired
    private FranquiciasRepositorio repositorio;

    @Override
    public List<Franquicias> listar() {
        return repositorio.findAll();
    }

    @Override
    public Franquicias listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Franquicias add(Franquicias f) {
        return repositorio.save(f);
    }

    @Override
    public Franquicias edit(Franquicias f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<Franquicias> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Franquicias delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
