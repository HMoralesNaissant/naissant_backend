/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Cuentasxcobrar;

import java.util.List;


public interface CuentasxcobrarService {
    List<Cuentasxcobrar>listar();
    Cuentasxcobrar listarId(int id);
    Cuentasxcobrar add(Cuentasxcobrar c);
    Cuentasxcobrar edit(Cuentasxcobrar c);
    Cuentasxcobrar delete(int id);

    List<Cuentasxcobrar>listarByNumCxc(Double num_cxc);
    List<Cuentasxcobrar>listarByIdFactura(int id_factura);
    List<Cuentasxcobrar>listarByIdEstudiante(int id_estudiante);
    List<Cuentasxcobrar>listarByIdAnoSemestre(int id_ano_semestre);
}
