/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ArqueosCajas;
import com.naissant.naissantapp.Repository.ArqueosCajasRepositorio;
import com.naissant.naissantapp.Service.ArqueosCajasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArqueosCajasServiceImp implements ArqueosCajasService {
    @Autowired
    private ArqueosCajasRepositorio repositorio;
    
    @Override
    public List<ArqueosCajas> listar() {
        return repositorio.findAll();
    }

    @Override
    public ArqueosCajas listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ArqueosCajas add(ArqueosCajas a) {
        return repositorio.save(a);
    }

    @Override
    public ArqueosCajas edit(ArqueosCajas a) {
        return repositorio.save(a);
    }
    
    @Override
    public List<ArqueosCajas> listarByIdCaja(int id_caja) {
        return repositorio.findByCajaId_Id(id_caja);
    }

    @Override
    public List<ArqueosCajas> listarByIdUsuario(int id_usuario) {
        return repositorio.findByUsuarioId_Id(id_usuario);
    }

    @Override
    public List<ArqueosCajas> listarByIdSucursal(int id_sucursal) {
        return repositorio.findBySucursalId_Id(id_sucursal);
    }

    @Override
    public List<ArqueosCajas> listarByNumArqueo(Double num_arqueo) {
        return repositorio.findByNumArqueo(num_arqueo);
    }

    @Override
    public ArqueosCajas delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
