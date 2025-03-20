/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.OrdenServiciosDet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface OrdenServiciosDetRepositorio extends JpaRepository<OrdenServiciosDet, Integer>{
    
    List<OrdenServiciosDet>findByOrdenServicioId_Id(int id_orden_servicio);
    List<OrdenServiciosDet>findByConceptoId_Id(int id_concepto);
    List<OrdenServiciosDet>findByProcedimientoId_Id(int id_procedimiento);
}
