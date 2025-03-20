/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.CalificacionProductosDetRepositorio;
import com.naissant.naissantapp.Entity.CalificacionProductosDet;
import com.naissant.naissantapp.Service.CalificacionProductosDetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionProductosDetServiceImp implements CalificacionProductosDetService{
    @Autowired
    private CalificacionProductosDetRepositorio repositorio;
    
    @Override
    public List<CalificacionProductosDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public CalificacionProductosDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CalificacionProductosDet add(CalificacionProductosDet c) {
        return repositorio.save(c);
    }

    @Override
    public CalificacionProductosDet edit(CalificacionProductosDet c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<CalificacionProductosDet> listarByIdCalificacion(int id_calificacion) {
        return repositorio.findByCalificacionId_Id(id_calificacion);
    }
    
    @Override
    public CalificacionProductosDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
