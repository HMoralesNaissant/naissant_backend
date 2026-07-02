/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Disabilities;
import com.naissant.naissantapp.Service.DisabilitiesService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"/disabilities"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class DisabilitiesController {

    @Autowired
    DisabilitiesService service;

    private final Logger LOG = LoggerFactory.getLogger(DisabilitiesController.class);

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
    public ResponseEntity agregar(@RequestBody Disabilities d) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(d), true));
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
    public ResponseEntity editar(@RequestBody Disabilities d, @PathVariable("id") int id) {
        try {
            d.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(d), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByEmployee/{id_employee}"})
    public ResponseEntity listarByIdEmployee(@PathVariable("id_employee") int id_employee) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdEmployee(id_employee), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @PostMapping(path= "/{disability_id}/photo/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "disability_id") Integer disabilityId,
            @RequestParam("description") String description) {

        try {
            return ResponseEntity.ok().body(service.saveSupport(disabilityId, files, description));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }
    
    @GetMapping("/{disability_id}/photo")
    public ResponseEntity getSupport(@PathVariable(name = "disability_id") Integer disabilityId) {
        try {
            Resource file = service.downloadSupport(disabilityId);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
