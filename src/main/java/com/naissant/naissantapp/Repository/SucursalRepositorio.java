/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Sucursal;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface SucursalRepositorio extends Repository<Sucursal, Integer>{
    List<Sucursal>findAll();
    Sucursal findById(int id);
    Sucursal save(Sucursal s);
    void delete(Sucursal s);
    
    List<Sucursal>findByEmpresaId_Id(int id_empresa);
}
