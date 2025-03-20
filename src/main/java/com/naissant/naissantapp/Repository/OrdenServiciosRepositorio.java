/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.OrdenServicios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface OrdenServiciosRepositorio extends JpaRepository<OrdenServicios, Integer>{
    
    List<OrdenServicios>findByNumRecibo(Double num_recibo);
    List<OrdenServicios>findByPacienteId_Id(int id_paciente);
    List<OrdenServicios>findByEstudianteId_Id(int id_estudiante);
    List<OrdenServicios>findByAnoSemestreId_Id(int id_ano_semestre);
}
