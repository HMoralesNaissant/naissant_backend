/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.CalificacionProductosDet;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CalificacionProductosDetRepositorio extends JpaRepository<CalificacionProductosDet, Integer>{
    
    List<CalificacionProductosDet>findByCalificacionId_Id(int id_calificacion);
}
