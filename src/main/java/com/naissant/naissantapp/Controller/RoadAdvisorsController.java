/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.RoadAdvisors;
import com.naissant.naissantapp.Service.RoadAdvisorsService;
import com.naissant.naissantapp.domain.ResponseDto;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/roadadvisors"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class RoadAdvisorsController {

    @Autowired
    RoadAdvisorsService service;

    private final Logger LOG = LoggerFactory.getLogger(RoadAdvisorsController.class);

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
    public ResponseEntity agregar(@RequestBody RoadAdvisors r) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(r), true));
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
    public ResponseEntity editar(@RequestBody RoadAdvisors r, @PathVariable("id") int id) {
        try {
            r.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(r), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByAdvisor/{id_advisor}"})
    public ResponseEntity listarByIdAdvisor(@PathVariable("id_advisor") int id_advisor) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdAdvisor(id_advisor), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByCustomer/{id_customer}"})
    public ResponseEntity listarByIdCustomer(@PathVariable("id_customer") int id_customer) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdCustomer(id_customer), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    /*@GetMapping(path = {"/findByDateVisit/{dateVisit}"})
    public ResponseEntity listarByDateVisit(@PathVariable("dateVisit") Date dateVisit) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByDateVisit(dateVisit), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }*/
}
