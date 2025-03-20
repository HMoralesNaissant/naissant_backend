/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.NivelEstudiosRepositorio;
import com.naissant.naissantapp.Entity.NivelEstudios;
import com.naissant.naissantapp.Service.NivelEstudiosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelEstudiosServiceImp implements NivelEstudiosService{
    @Autowired
    private NivelEstudiosRepositorio repositorio;
    
    @Override
    public List<NivelEstudios> listar() {
        return repositorio.findAll();
    }

    @Override
    public NivelEstudios listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public NivelEstudios add(NivelEstudios n) {
        return repositorio.save(n);
    }

    @Override
    public NivelEstudios edit(NivelEstudios n) {
        return repositorio.save(n);
    }
    
    @Override
    public List<NivelEstudios> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public NivelEstudios delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
