/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.OrdenServicios;
import com.naissant.naissantapp.Repository.OrdenServiciosRepositorio;
import com.naissant.naissantapp.Service.OrdenServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenServiciosServiceImp implements OrdenServiciosService {
    @Autowired
    private OrdenServiciosRepositorio repositorio;
    
    @Override
    public List<OrdenServicios> listar() {
        return repositorio.findAll();
    }

    @Override
    public OrdenServicios listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public OrdenServicios add(OrdenServicios o) {
        return repositorio.save(o);
    }

    @Override
    public OrdenServicios edit(OrdenServicios o) {
        return repositorio.save(o);
    }
    
    @Override
    public List<OrdenServicios> listarByNumRecibo(Double num_recibo) {
        return repositorio.findByNumRecibo(num_recibo);
    }

    @Override
    public List<OrdenServicios> listarByIdPaciente(int id_paciente) {
        return repositorio.findByPacienteId_Id(id_paciente);
    }

    @Override
    public List<OrdenServicios> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }

    @Override
    public List<OrdenServicios> listarByIdAnoSemestre(int id_ano_semestre) {
        return repositorio.findByAnoSemestreId_Id(id_ano_semestre);
    }
    
    @Override
    public OrdenServicios delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
