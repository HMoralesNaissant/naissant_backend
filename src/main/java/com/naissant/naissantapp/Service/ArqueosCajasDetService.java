/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ArqueosCajasDet;

import java.util.List;


public interface ArqueosCajasDetService {
    List<ArqueosCajasDet>listar();
    ArqueosCajasDet listarId(int id);
    ArqueosCajasDet add(ArqueosCajasDet a);
    ArqueosCajasDet edit(ArqueosCajasDet a);
    ArqueosCajasDet delete(int id);
    
    List<ArqueosCajasDet>listarByIdArqueoCaja(int id_arqueo_caja);
    List<ArqueosCajasDet>listarByIdMedioPago(int id_medio_pago);
}
