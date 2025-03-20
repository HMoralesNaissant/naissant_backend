/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ArqueosCajas;

import java.util.List;


public interface ArqueosCajasService {
    List<ArqueosCajas>listar();
    ArqueosCajas listarId(int id);
    ArqueosCajas add(ArqueosCajas a);
    ArqueosCajas edit(ArqueosCajas a);
    ArqueosCajas delete(int id);
    
    List<ArqueosCajas>listarByIdCaja(int id_caja);
    List<ArqueosCajas>listarByIdSucursal(int id_sucursal);
    List<ArqueosCajas>listarByIdUsuario(int id_usuario);
    List<ArqueosCajas>listarByNumArqueo(Double num_arqueo);
}
