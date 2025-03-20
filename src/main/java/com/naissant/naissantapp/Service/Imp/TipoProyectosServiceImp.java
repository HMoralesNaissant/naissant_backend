/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.TipoProyectosRepositorio;
import com.naissant.naissantapp.Entity.TipoProyectos;
import com.naissant.naissantapp.Service.TipoProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProyectosServiceImp implements TipoProyectosService{
    @Autowired
    private TipoProyectosRepositorio repositorio;
    
    @Override
    public List<TipoProyectos> listar() {
        return repositorio.findAll();
    }

    @Override
    public TipoProyectos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TipoProyectos add(TipoProyectos t) {
        return repositorio.save(t);
    }

    @Override
    public TipoProyectos edit(TipoProyectos t) {
        return repositorio.save(t);
    }
    
    @Override
    public List<TipoProyectos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public TipoProyectos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
