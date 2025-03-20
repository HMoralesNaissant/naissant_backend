/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.InvestigadoresDetRepositorio;
import com.naissant.naissantapp.Entity.InvestigadoresDet;
import com.naissant.naissantapp.Service.InvestigadoresDetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestigadoresDetServiceImp implements InvestigadoresDetService{
    @Autowired
    private InvestigadoresDetRepositorio repositorio;
    
    @Override
    public List<InvestigadoresDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public InvestigadoresDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public InvestigadoresDet add(InvestigadoresDet i) {
        return repositorio.save(i);
    }

    @Override
    public InvestigadoresDet edit(InvestigadoresDet i) {
        return repositorio.save(i);
    }
    
    @Override
    public List<InvestigadoresDet> listarByIdInvestigador(int id_investigador) {
        return repositorio.findByInvestigadorId_Id(id_investigador);
    }
    
    @Override
    public List<InvestigadoresDet> listarByIdGrupo(int id_grupo) {
        return repositorio.findByGrupoId_Id(id_grupo);
    }

    @Override
    public InvestigadoresDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
