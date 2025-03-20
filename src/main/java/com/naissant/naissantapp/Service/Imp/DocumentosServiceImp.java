/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.DocumentosRepositorio;
import com.naissant.naissantapp.Entity.Documentos;
import com.naissant.naissantapp.Service.DocumentosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentosServiceImp implements DocumentosService{
    @Autowired
    private DocumentosRepositorio repositorio;
    
    @Override
    public List<Documentos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Documentos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Documentos add(Documentos d) {
        return repositorio.save(d);
    }

    @Override
    public Documentos edit(Documentos d) {
        return repositorio.save(d);
    }
    
    @Override
    public List<Documentos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public Documentos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
