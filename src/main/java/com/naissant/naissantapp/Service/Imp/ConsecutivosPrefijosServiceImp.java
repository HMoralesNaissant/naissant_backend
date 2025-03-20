/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ConsecutivosPrefijos;
import com.naissant.naissantapp.Repository.ConsecutivosPrefijosRepositorio;
import com.naissant.naissantapp.Service.ConsecutivosPrefijosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsecutivosPrefijosServiceImp implements ConsecutivosPrefijosService {
    @Autowired
    private ConsecutivosPrefijosRepositorio repositorio;
    
    @Override
    public List<ConsecutivosPrefijos> listar() {
        return repositorio.findAll();
    }

    @Override
    public ConsecutivosPrefijos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public ConsecutivosPrefijos add(ConsecutivosPrefijos c) {
        return repositorio.save(c);
    }

    @Override
    public ConsecutivosPrefijos edit(ConsecutivosPrefijos c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<ConsecutivosPrefijos> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public List<ConsecutivosPrefijos> listarByIdArea(int id_area) {
        return repositorio.findByAreaId_Id(id_area);
    }

    @Override
    public ConsecutivosPrefijos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
