/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.ClasificacionProductosRepositorio;
import com.naissant.naissantapp.Entity.ClasificacionProductos;
import com.naissant.naissantapp.Service.ClasificacionProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificacionProductosServiceImp implements ClasificacionProductosService{
    @Autowired
    private ClasificacionProductosRepositorio repositorio;
    
    @Override
    public List<ClasificacionProductos> listar() {
        return repositorio.findAll();
    }

    @Override
    public ClasificacionProductos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ClasificacionProductos add(ClasificacionProductos c) {
        return repositorio.save(c);
    }

    @Override
    public ClasificacionProductos edit(ClasificacionProductos c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<ClasificacionProductos> listarByIdTipoprod(int id_tipoprod) {
        return repositorio.findByTipoprodId_Id(id_tipoprod);
    }
    
    @Override
    public List<ClasificacionProductos> listarByIdProducto(int id_producto) {
        return repositorio.findByProductoId_Id(id_producto);
    }

    @Override
    public ClasificacionProductos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
