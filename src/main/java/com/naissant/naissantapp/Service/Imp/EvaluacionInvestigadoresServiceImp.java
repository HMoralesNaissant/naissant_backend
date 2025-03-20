/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.EvaluacionInvestigadoresRepositorio;
import com.naissant.naissantapp.Entity.EvaluacionInvestigadores;
import com.naissant.naissantapp.Service.EvaluacionInvestigadoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionInvestigadoresServiceImp implements EvaluacionInvestigadoresService{
    @Autowired
    private EvaluacionInvestigadoresRepositorio repositorio;
    
    @Override
    public List<EvaluacionInvestigadores> listar() {
        return repositorio.findAll();
    }

    @Override
    public EvaluacionInvestigadores listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public EvaluacionInvestigadores add(EvaluacionInvestigadores e) {
        return repositorio.save(e);
    }

    @Override
    public EvaluacionInvestigadores edit(EvaluacionInvestigadores e) {
        return repositorio.save(e);
    }
    
    @Override
    public List<EvaluacionInvestigadores> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public EvaluacionInvestigadores delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
