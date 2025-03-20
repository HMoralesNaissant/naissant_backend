/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.OrdenServicios;

import java.util.List;


public interface OrdenServiciosService {
    List<OrdenServicios>listar();
    OrdenServicios listarId(int id);
    OrdenServicios add(OrdenServicios o);
    OrdenServicios edit(OrdenServicios o);
    OrdenServicios delete(int id);
    
    List<OrdenServicios>listarByNumRecibo(Double num_recibo);
    List<OrdenServicios>listarByIdPaciente(int id_paciente);
    List<OrdenServicios>listarByIdEstudiante(int id_estudiante);
    List<OrdenServicios>listarByIdAnoSemestre(int id_ano_semestre);
}
