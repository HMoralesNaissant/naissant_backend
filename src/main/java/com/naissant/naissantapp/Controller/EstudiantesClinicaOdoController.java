/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.EstudiantesClinicaOdo;
import com.naissant.naissantapp.Service.EstudiantesClinicaOdoService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/estudiantesclinicaodo"})

public class EstudiantesClinicaOdoController {

    @Autowired
    EstudiantesClinicaOdoService service;

    private final Logger LOG = LoggerFactory.getLogger(EstudiantesClinicaOdoController.class);

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
    public ResponseEntity agregar(@RequestBody EstudiantesClinicaOdo u) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(u), true));
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
    public ResponseEntity editar(@RequestBody EstudiantesClinicaOdo u, @PathVariable("id") int id) {
        try {
            u.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(u), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByPersona/{id_persona}"})
    public ResponseEntity listarByIdPersona(@PathVariable("id_persona") int id_persona) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdPersona(id_persona), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByPrograma/{id_programa}"})
    public ResponseEntity listarByIdPrograma(@PathVariable("id_programa") int id_programa) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdPrograma(id_programa), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

}
