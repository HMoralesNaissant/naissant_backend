/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.FacturasPagos;

import java.util.List;


public interface FacturasPagosService {
    List<FacturasPagos>listar();
    FacturasPagos listarId(int id);
    FacturasPagos add(FacturasPagos f);
    FacturasPagos edit(FacturasPagos f);
    FacturasPagos delete(int id);
    
    List<FacturasPagos>listarByIdFactura(int id_factura);
    List<FacturasPagos>listarByIdMedioPago(int id_medio_pago);
}
