/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.EstudiantesClinicaOdo;
import java.util.List;


public interface EstudiantesClinicaOdoService {
    List<EstudiantesClinicaOdo>listar();
    EstudiantesClinicaOdo listarId(int id);
    EstudiantesClinicaOdo add(EstudiantesClinicaOdo u);
    EstudiantesClinicaOdo edit(EstudiantesClinicaOdo u);
    EstudiantesClinicaOdo delete(int id);
    
    List<EstudiantesClinicaOdo>listarByIdPersona(int id_persona);
    List<EstudiantesClinicaOdo>listarByIdPrograma(int id_programa);
}
