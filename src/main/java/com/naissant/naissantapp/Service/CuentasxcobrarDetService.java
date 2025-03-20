/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.CuentasxcobrarDet;

import java.util.List;


public interface CuentasxcobrarDetService {
    List<CuentasxcobrarDet>listar();
    CuentasxcobrarDet listarId(int id);
    CuentasxcobrarDet add(CuentasxcobrarDet c);
    CuentasxcobrarDet edit(CuentasxcobrarDet c);
    CuentasxcobrarDet delete(int id);

    List<CuentasxcobrarDet>listarByIdFactura(int id_factura);
    List<CuentasxcobrarDet>listarByIdCuentasxcobrar(int id_cuentasxcobrar);
}
