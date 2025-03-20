/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Digitalizacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface DigitalizacionRepositorio extends JpaRepository<Digitalizacion, Integer>{
    
    List<Digitalizacion>findByEstudianteId_Id(int id_estudiante);
}
