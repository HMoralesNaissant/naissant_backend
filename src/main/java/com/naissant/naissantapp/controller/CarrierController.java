/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.controller;

import com.naissant.naissantapp.entity.Carrier;
import com.naissant.naissantapp.service.CarrierService;
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
@RequestMapping({"/carrier"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class CarrierController {

    @Autowired
    CarrierService service;

    private final Logger LOG = LoggerFactory.getLogger(CarrierController.class);

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
    public ResponseEntity agregar(@RequestBody Carrier c) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(c), true));
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
    public ResponseEntity editar(@RequestBody Carrier c, @PathVariable("id") int id) {
        try {
            c.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(c), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByCompany/{id_company}"})
    public ResponseEntity listarByIdCompany(@PathVariable("id_company") int id_company) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdCompany(id_company), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @PostMapping(path = "/{carrier_id}/photo/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "carrier_id") Integer carrierId,
            @RequestParam("description") String description) {

        try {
            return ResponseEntity.ok().body(service.savePhotoProfile(carrierId, files, description));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }

    @GetMapping("/{carrier_id}/photo")
    public ResponseEntity getProfilePicture(@PathVariable(name = "carrier_id") Integer carrierId) {
        try {
            Resource file = service.downloadProfilePicture(carrierId);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
