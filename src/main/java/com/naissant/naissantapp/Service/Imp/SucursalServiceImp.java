/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Sucursal;
import com.naissant.naissantapp.Repository.SucursalRepositorio;
import com.naissant.naissantapp.Service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImp implements SucursalService{
    @Autowired
    private SucursalRepositorio repositorio;
    
    @Override
    public List<Sucursal> listar() {
        return repositorio.findAll();
    }

    @Override
    public Sucursal listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Sucursal add(Sucursal s) {
        return repositorio.save(s);
    }

    @Override
    public Sucursal edit(Sucursal s) {
        return repositorio.save(s);
    }
    
    @Override
    public List<Sucursal> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Sucursal delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
