/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PermisoUsuarios;
import com.naissant.naissantapp.Repository.PermisoUsuariosRepositorio;
import com.naissant.naissantapp.Service.PermisoUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermisoUsuariosServiceImp implements PermisoUsuariosService {
    @Autowired
    private PermisoUsuariosRepositorio repositorio;
    
    @Override
    public List<PermisoUsuarios> listar() {
        return repositorio.findAll();
    }

    @Override
    public PermisoUsuarios listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PermisoUsuarios add(PermisoUsuarios p) {
        return repositorio.save(p);
    }

    @Override
    public PermisoUsuarios edit(PermisoUsuarios p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<PermisoUsuarios> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public List<PermisoUsuarios> listarByIdUsuario(int id_usuario) {
        return repositorio.findByUsuarioId_Id(id_usuario);
    }

    @Override
    public List<PermisoUsuarios> listarByIdArea(int id_area) {
        return repositorio.findByAreaId_Id(id_area);
    }

    @Override
    public PermisoUsuarios delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
