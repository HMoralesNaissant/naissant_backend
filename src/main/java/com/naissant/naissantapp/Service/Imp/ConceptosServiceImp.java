/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.Conceptos;
import com.naissant.naissantapp.Repository.ConceptosRepositorio;
import com.naissant.naissantapp.Service.ConceptosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConceptosServiceImp implements ConceptosService {
    @Autowired
    private ConceptosRepositorio repositorio;
    
    @Override
    public List<Conceptos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Conceptos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Conceptos add(Conceptos c) {
        return repositorio.save(c);
    }

    @Override
    public Conceptos edit(Conceptos c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<Conceptos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Conceptos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
