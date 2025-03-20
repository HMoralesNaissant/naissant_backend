/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Cajas;
import com.naissant.naissantapp.Repository.CajasRepositorio;
import com.naissant.naissantapp.Service.CajasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CajasServiceImp implements CajasService {
    @Autowired
    private CajasRepositorio repositorio;

    @Override
    public List<Cajas> listar() {
        return repositorio.findAll();
    }

    @Override
    public Cajas listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Cajas add(Cajas c) {
        return repositorio.save(c);
    }

    @Override
    public Cajas edit(Cajas c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<Cajas> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public Cajas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
