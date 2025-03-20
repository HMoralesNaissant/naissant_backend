/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ProgAcademicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.naissant.naissantapp.Repository.ProgAcademicosRepositorio;
import com.naissant.naissantapp.Service.ProgAcademicosService;

@Service
public class ProgAcademicosServiceImp implements ProgAcademicosService{
    @Autowired
    private ProgAcademicosRepositorio repositorio;
    
    @Override
    public List<ProgAcademicos> listar() {
        return repositorio.findAll();
    }

    @Override
    public ProgAcademicos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProgAcademicos add(ProgAcademicos p) {
        return repositorio.save(p);
    }

    @Override
    public ProgAcademicos edit(ProgAcademicos p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<ProgAcademicos> listarByIdTipoprograma(int id_tipoprograma) {
        return repositorio.findByTipoprogramaId_Id(id_tipoprograma);
    }

    @Override
    public ProgAcademicos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
