/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.FacturasDet;

import java.util.List;


public interface FacturasDetService {
    List<FacturasDet>listar();
    FacturasDet listarId(int id);
    FacturasDet add(FacturasDet f);
    FacturasDet edit(FacturasDet f);
    FacturasDet delete(int id);
    
    List<FacturasDet>listarByIdFactura(int id_factura);
}
