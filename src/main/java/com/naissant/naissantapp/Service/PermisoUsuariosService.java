/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PermisoUsuarios;

import java.util.List;


public interface PermisoUsuariosService {
    List<PermisoUsuarios>listar();
    PermisoUsuarios listarId(int id);
    PermisoUsuarios add(PermisoUsuarios p);
    PermisoUsuarios edit(PermisoUsuarios p);
    PermisoUsuarios delete(int id);
    
    List<PermisoUsuarios>listarByIdSucursal(int id_sucursal);
    List<PermisoUsuarios>listarByIdUsuario(int id_usuario);
    List<PermisoUsuarios>listarByIdArea(int id_area);
}
