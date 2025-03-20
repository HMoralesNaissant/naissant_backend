/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.CargosInvestigadoresRepositorio;
import com.naissant.naissantapp.Entity.CargosInvestigadores;
import com.naissant.naissantapp.Service.CargosInvestigadoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargosInvestigadoresServiceImp implements CargosInvestigadoresService{
    @Autowired
    private CargosInvestigadoresRepositorio repositorio;
    
    @Override
    public List<CargosInvestigadores> listar() {
        return repositorio.findAll();
    }

    @Override
    public CargosInvestigadores listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CargosInvestigadores add(CargosInvestigadores c) {
        return repositorio.save(c);
    }

    @Override
    public CargosInvestigadores edit(CargosInvestigadores c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<CargosInvestigadores> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public CargosInvestigadores delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
