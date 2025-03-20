/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Procedimientos;
import com.naissant.naissantapp.Repository.ProcedimientosRepositorio;
import com.naissant.naissantapp.Service.ProcedimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProcedimientosServiceImp implements ProcedimientosService {
    @Autowired
    private ProcedimientosRepositorio repositorio;
    
    @Override
    public List<Procedimientos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Procedimientos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Procedimientos add(Procedimientos p) {
        return repositorio.save(p);
    }

    @Override
    public Procedimientos edit(Procedimientos p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<Procedimientos> listarByIdConcepto(int id_concepto) {
        return repositorio.findByConceptoId_Id(id_concepto);
    }

    @Override
    public Procedimientos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
