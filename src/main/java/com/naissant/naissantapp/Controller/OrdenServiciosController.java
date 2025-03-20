/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.OrdenServicios;
import com.naissant.naissantapp.Service.OrdenServiciosService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/ordenServicios"})

public class OrdenServiciosController {

    @Autowired
    OrdenServiciosService service;

    private final Logger LOG = LoggerFactory.getLogger(OrdenServiciosController.class);

    @GetMapping
    public ResponseEntity listar() {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listar(), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @PostMapping
    public ResponseEntity agregar(@RequestBody OrdenServicios o) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(o), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/{id}"})
    public ResponseEntity listarId(@PathVariable("id") int id) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarId(id), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @PutMapping(path = {"/{id}"})
    public ResponseEntity editar(@RequestBody OrdenServicios o, @PathVariable("id") int id) {
        try {
            o.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(o), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByNumRecibo/{num_recibo}"})
    public ResponseEntity listarByNumRecibo(@PathVariable("num_recibo") Double num_recibo) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByNumRecibo(num_recibo), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByPaciente/{id_paciente}"})
    public ResponseEntity listarByIdPaciente(@PathVariable("id_paciente") int id_paciente) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdPaciente(id_paciente), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByEstudiante/{id_estudiante}"})
    public ResponseEntity listarByIdEstudiante(@PathVariable("id_estudiante") int id_estudiante) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdEstudiante(id_estudiante), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByAnoSemestre/{id_ano_semestre}"})
    public ResponseEntity listarByIdAnoSemestre(@PathVariable("id_ano_semestre") int id_ano_semestre) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdAnoSemestre(id_ano_semestre), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
