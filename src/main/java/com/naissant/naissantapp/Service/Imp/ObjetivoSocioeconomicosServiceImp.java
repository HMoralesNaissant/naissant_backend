/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.ObjetivoSocioeconomicosRepositorio;
import com.naissant.naissantapp.Entity.ObjetivoSocioeconomicos;
import com.naissant.naissantapp.Service.ObjetivoSocioeconomicosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjetivoSocioeconomicosServiceImp implements ObjetivoSocioeconomicosService{
    @Autowired
    private ObjetivoSocioeconomicosRepositorio repositorio;
    
    @Override
    public List<ObjetivoSocioeconomicos> listar() {
        return repositorio.findAll();
    }

    @Override
    public ObjetivoSocioeconomicos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ObjetivoSocioeconomicos add(ObjetivoSocioeconomicos o) {
        return repositorio.save(o);
    }

    @Override
    public ObjetivoSocioeconomicos edit(ObjetivoSocioeconomicos o) {
        return repositorio.save(o);
    }
    
    @Override
    public List<ObjetivoSocioeconomicos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public ObjetivoSocioeconomicos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
