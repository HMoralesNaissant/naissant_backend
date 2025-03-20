/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Facturas;

import java.util.List;


public interface FacturasService {
    List<Facturas>listar();
    Facturas listarId(int id);
    Facturas add(Facturas f);
    Facturas edit(Facturas f);
    Facturas delete(int id);
    
    List<Facturas>listarByNumFactura(Double num_factura);
    List<Facturas>listarByIdPaciente(int id_paciente);
    List<Facturas>listarByIdEstudiante(int id_estudiante);
    List<Facturas>listarByIdCaja(int id_caja);
    List<Facturas>listarByIdOrdenServicio(int id_orden_servicio);
    List<Facturas>listarByIdSucursal(int id_sucursal);
    List<Facturas>listarByIdFormaPago(int id_forma_pago);
}
