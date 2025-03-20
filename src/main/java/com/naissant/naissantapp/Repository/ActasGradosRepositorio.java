/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ActasGrados;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ActasGradosRepositorio extends JpaRepository<ActasGrados, Integer>{
    
    List<ActasGrados>findByEstudianteId_Id(int id_estudiante);
}
