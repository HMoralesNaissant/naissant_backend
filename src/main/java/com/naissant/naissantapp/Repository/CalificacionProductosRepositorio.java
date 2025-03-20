/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.CalificacionProductos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CalificacionProductosRepositorio extends JpaRepository<CalificacionProductos, Integer>{
    
    List<CalificacionProductos>findByEvidenciaId_Id(int id_evidencia);
    
}
