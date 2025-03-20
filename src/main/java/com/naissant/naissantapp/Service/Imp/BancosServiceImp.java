/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Bancos;
import com.naissant.naissantapp.Repository.BancosRepositorio;
import com.naissant.naissantapp.Service.BancosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancosServiceImp implements BancosService {
    @Autowired
    private BancosRepositorio repositorio;

    @Override
    public List<Bancos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Bancos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Bancos add(Bancos b) {
        return repositorio.save(b);
    }

    @Override
    public Bancos edit(Bancos b) {
        return repositorio.save(b);
    }
    
    @Override
    public List<Bancos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Bancos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
