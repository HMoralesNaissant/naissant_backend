/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.OrdenServiciosDet;

import java.util.List;


public interface OrdenServiciosDetService {
    List<OrdenServiciosDet>listar();
    OrdenServiciosDet listarId(int id);
    OrdenServiciosDet add(OrdenServiciosDet o);
    OrdenServiciosDet edit(OrdenServiciosDet o);
    OrdenServiciosDet delete(int id);
    
    List<OrdenServiciosDet>listarByIdOrdenServicio(int id_orden_servicio);
    List<OrdenServiciosDet>listarByIdConcepto(int id_concepto);
    List<OrdenServiciosDet>listarByIdProcedimiento(int id_procedimiento);
}
