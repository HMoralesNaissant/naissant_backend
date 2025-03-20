/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Estudiantes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EstudiantesRepositorio extends JpaRepository<Estudiantes, Integer>{
    
    List<Estudiantes>findByPersonaId_Id(int id_persona);
    List<Estudiantes>findByProgramaId_Id(int id_programa);
    List<Estudiantes>findBySalutem(String salutem);
}
