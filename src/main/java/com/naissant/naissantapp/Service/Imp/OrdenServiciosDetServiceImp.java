/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.OrdenServiciosDet;
import com.naissant.naissantapp.Repository.OrdenServiciosDetRepositorio;
import com.naissant.naissantapp.Service.OrdenServiciosDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenServiciosDetServiceImp implements OrdenServiciosDetService {
    @Autowired
    private OrdenServiciosDetRepositorio repositorio;
    
    @Override
    public List<OrdenServiciosDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public OrdenServiciosDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public OrdenServiciosDet add(OrdenServiciosDet o) {
        return repositorio.save(o);
    }

    @Override
    public OrdenServiciosDet edit(OrdenServiciosDet o) {
        return repositorio.save(o);
    }
    
    @Override
    public List<OrdenServiciosDet> listarByIdOrdenServicio(int id_orden_servicio) {
        return repositorio.findByOrdenServicioId_Id(id_orden_servicio);
    }

    @Override
    public List<OrdenServiciosDet> listarByIdConcepto(int id_concepto) {
        return repositorio.findByConceptoId_Id(id_concepto);
    }

    @Override
    public List<OrdenServiciosDet> listarByIdProcedimiento(int id_procedimiento) {
        return repositorio.findByProcedimientoId_Id(id_procedimiento);
    }
    
    @Override
    public OrdenServiciosDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
