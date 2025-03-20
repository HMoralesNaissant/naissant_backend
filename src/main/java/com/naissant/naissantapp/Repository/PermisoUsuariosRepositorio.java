/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PermisoUsuarios;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface PermisoUsuariosRepositorio extends Repository<PermisoUsuarios, Integer>{
    List<PermisoUsuarios>findAll();
    PermisoUsuarios findById(int id);
    PermisoUsuarios save(PermisoUsuarios p);
    void delete(PermisoUsuarios p);
    
    List<PermisoUsuarios>findBySucursalId_Id(int id_sucursal);
    List<PermisoUsuarios>findByUsuarioId_Id(int id_usuario);
    List<PermisoUsuarios>findByAreaId_Id(int id_area);
}
