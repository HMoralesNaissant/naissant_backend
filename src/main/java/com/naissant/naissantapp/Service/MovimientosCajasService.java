/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.MovimientosCajas;

import java.util.List;


public interface MovimientosCajasService {
    List<MovimientosCajas>listar();
    MovimientosCajas listarId(int id);
    MovimientosCajas add(MovimientosCajas m);
    MovimientosCajas edit(MovimientosCajas m);
    MovimientosCajas delete(int id);
    
    List<MovimientosCajas>listarByIdCaja(int id_caja);
    List<MovimientosCajas>listarByIdSucursal(int id_sucursal);
    List<MovimientosCajas>listarByIdMedioPago(int id_medio_pago);
}
