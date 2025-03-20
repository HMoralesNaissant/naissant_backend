/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.FormasPagos;
import com.naissant.naissantapp.Repository.FormasPagosRepositorio;
import com.naissant.naissantapp.Service.FormasPagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FormasPagosServiceImp implements FormasPagosService {
    @Autowired
    private FormasPagosRepositorio repositorio;
    
    @Override
    public List<FormasPagos> listar() {
        return repositorio.findAll();
    }

    @Override
    public FormasPagos listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public FormasPagos add(FormasPagos f) {
        return repositorio.save(f);
    }

    @Override
    public FormasPagos edit(FormasPagos f) {
        return repositorio.save(f);
    }
    
    @Override
    public List<FormasPagos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public FormasPagos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
