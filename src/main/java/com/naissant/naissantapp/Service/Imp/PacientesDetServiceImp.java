/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.PacientesDet;
import com.naissant.naissantapp.Repository.PacientesDetRepositorio;
import com.naissant.naissantapp.Service.PacientesDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesDetServiceImp implements PacientesDetService {
    @Autowired
    private PacientesDetRepositorio repositorio;
    
    @Override
    public List<PacientesDet> listar() {
        return repositorio.findAll();
    }

    @Override
    public PacientesDet listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public PacientesDet add(PacientesDet p) {
        return repositorio.save(p);
    }

    @Override
    public PacientesDet edit(PacientesDet p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<PacientesDet> listarByIdPaciente(int id_paciente) {
        return repositorio.findByPacienteId_Id(id_paciente);
    }
    
    @Override
    public List<PacientesDet> listarByIdEstudianteAutorizado(int id_estudiante_autorizado) {
        return repositorio.findByEstudianteAutorizadoId_Id(id_estudiante_autorizado);
    }

    @Override
    public List<PacientesDet> listarByIdConcepto(int id_concepto) {
        return repositorio.findByConceptoId_Id(id_concepto);
    }

    @Override
    public PacientesDet delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
