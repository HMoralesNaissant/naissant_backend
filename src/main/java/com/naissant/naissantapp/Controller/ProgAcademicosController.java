/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ProgAcademicos;
import com.naissant.naissantapp.domain.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.naissant.naissantapp.Service.ProgAcademicosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping({"/progAcademicos"})

public class ProgAcademicosController {

    @Autowired
    ProgAcademicosService service;

    private final Logger LOG = LoggerFactory.getLogger(ProgAcademicosController.class);

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
    public ResponseEntity agregar(@RequestBody ProgAcademicos p) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(p), true));
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
    public ResponseEntity editar(@RequestBody ProgAcademicos p, @PathVariable("id") int id) {
        try {
            p.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(p), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByTipoprograma/{id_tipoprograma}"})
    public ResponseEntity listarByIdTipoprograma(@PathVariable("id_tipoprograma") int id_tipoprograma) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdTipoprograma(id_tipoprograma), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

}
