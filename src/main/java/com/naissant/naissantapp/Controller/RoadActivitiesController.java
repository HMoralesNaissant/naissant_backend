/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.RoadActivities;
import com.naissant.naissantapp.Service.RoadActivitiesService;
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
@RequestMapping({"/roadactivities"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class RoadActivitiesController {

    @Autowired
    RoadActivitiesService service;

    private final Logger LOG = LoggerFactory.getLogger(RoadActivitiesController.class);

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
    public ResponseEntity agregar(@RequestBody RoadActivities r) {
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
    public ResponseEntity editar(@RequestBody RoadActivities r, @PathVariable("id") int id) {
        try {
            r.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(r), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByRoadAdvisor/{id_road_advisor}"})
    public ResponseEntity listarByIdRoadAdvisor(@PathVariable("id_road_advisor") int id_road_advisor) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdRoadAdvisor(id_road_advisor), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByProcedureActivity/{id_procedure_activity}"})
    public ResponseEntity listarByIdProcedureActivity(@PathVariable("id_procedure_activity") int id_procedure_activity) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdProcedureActivity(id_procedure_activity), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    /*@GetMapping(path = {"/findByDateActivity/{dateActivity}"})
    public ResponseEntity listarByDateActivity(@PathVariable("dateActivity") Date dateActivity) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByDateActivity(dateActivity), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }*/
}
