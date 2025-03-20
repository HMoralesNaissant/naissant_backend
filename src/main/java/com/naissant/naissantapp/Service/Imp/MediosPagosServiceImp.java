/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.MediosPagos;
import com.naissant.naissantapp.Repository.MediosPagosRepositorio;
import com.naissant.naissantapp.Service.MediosPagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediosPagosServiceImp implements MediosPagosService {
    @Autowired
    private MediosPagosRepositorio repositorio;
    
    @Override
    public List<MediosPagos> listar() {
        return repositorio.findAll();
    }

    @Override
    public MediosPagos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public MediosPagos add(MediosPagos m) {
        return repositorio.save(m);
    }

    @Override
    public MediosPagos edit(MediosPagos m) {
        return repositorio.save(m);
    }
    
    @Override
    public List<MediosPagos> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public MediosPagos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
