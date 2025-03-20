/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.CuentasxcobrarDet;
import com.naissant.naissantapp.Repository.CuentasxcobrarDetRepositorio;
import com.naissant.naissantapp.Service.CuentasxcobrarDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentasxcobrarDetServiceImp implements CuentasxcobrarDetService {
    @Autowired
    private CuentasxcobrarDetRepositorio repositorio;
    
    @Override
    public List<CuentasxcobrarDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public CuentasxcobrarDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CuentasxcobrarDet add(CuentasxcobrarDet c) {
        return repositorio.save(c);
    }

    @Override
    public CuentasxcobrarDet edit(CuentasxcobrarDet c) {
        return repositorio.save(c);
    }

    @Override
    public List<CuentasxcobrarDet> listarByIdFactura(int id_factura) {
        return repositorio.findByFacturaId_Id(id_factura);
    }

    @Override
    public List<CuentasxcobrarDet> listarByIdCuentasxcobrar(int id_cuentasxcobrar) {
        return repositorio.findByCuentasxcobrarId_Id(id_cuentasxcobrar);
    }

    @Override
    public CuentasxcobrarDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
