/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.InvestigadoresDet;
import com.naissant.naissantapp.Service.InvestigadoresDetService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/investigadoresDet"})

public class InvestigadoresDetController {

    @Autowired
    InvestigadoresDetService service;

    private final Logger LOG = LoggerFactory.getLogger(InvestigadoresDetController.class);

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
    public ResponseEntity agregar(@RequestBody InvestigadoresDet i) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(i), true));
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
    public ResponseEntity editar(@RequestBody InvestigadoresDet i, @PathVariable("id") int id) {
        try {
            i.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(i), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByInvestigador/{id_investigador}"})
    public ResponseEntity listarByIdInvestigador(@PathVariable("id_investigador") int id_investigador) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdInvestigador(id_investigador), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByGrupoinv/{id_grupo}"})
    public ResponseEntity listarByIdGrupo(@PathVariable("id_grupo") int id_grupo) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdGrupo(id_grupo), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

}
