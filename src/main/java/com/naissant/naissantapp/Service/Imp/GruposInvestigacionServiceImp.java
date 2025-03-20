/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.GruposInvestigacionRepositorio;
import com.naissant.naissantapp.Entity.GruposInvestigacion;
import com.naissant.naissantapp.Service.GruposInvestigacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GruposInvestigacionServiceImp implements GruposInvestigacionService{
    @Autowired
    private GruposInvestigacionRepositorio repositorio;
    
    @Override
    public List<GruposInvestigacion> listar() {
        return repositorio.findAll();
    }

    @Override
    public GruposInvestigacion listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public GruposInvestigacion add(GruposInvestigacion g) {
        return repositorio.save(g);
    }

    @Override
    public GruposInvestigacion edit(GruposInvestigacion g) {
        return repositorio.save(g);
    }
    
    @Override
    public List<GruposInvestigacion> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }
    
    @Override
    public GruposInvestigacion delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
