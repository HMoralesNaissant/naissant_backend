/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.CalificacionProductosDet;
import java.util.List;


public interface CalificacionProductosDetService {

    List<CalificacionProductosDet>listar();
    CalificacionProductosDet listarId(int id);
    CalificacionProductosDet add(CalificacionProductosDet c);
    CalificacionProductosDet edit(CalificacionProductosDet c);
    CalificacionProductosDet delete(int id);
    
    List<CalificacionProductosDet>listarByIdCalificacion(int id_calificacion);
}
