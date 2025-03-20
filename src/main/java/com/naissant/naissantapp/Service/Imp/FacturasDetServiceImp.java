/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.FacturasDet;
import com.naissant.naissantapp.Repository.FacturasDetRepositorio;
import com.naissant.naissantapp.Service.FacturasDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturasDetServiceImp implements FacturasDetService {
    @Autowired
    private FacturasDetRepositorio repositorio;
    
    @Override
    public List<FacturasDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public FacturasDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public FacturasDet add(FacturasDet f) {
        return repositorio.save(f);
    }

    @Override
    public FacturasDet edit(FacturasDet f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<FacturasDet> listarByIdFactura(int id_factura) {
        return repositorio.findByFacturaId_Id(id_factura);
    }

    @Override
    public FacturasDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
