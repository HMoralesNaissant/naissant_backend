/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 * */

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.EvidenciasInvestigador;
import com.naissant.naissantapp.Service.EvidenciasInvestigadorService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping({"/evidenciasInv"})

public class EvidenciasInvestigadorController {

    @Autowired
    EvidenciasInvestigadorService service;

    private final Logger LOG = LoggerFactory.getLogger(EvidenciasInvestigadorController.class);

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
    public ResponseEntity agregar(@RequestBody EvidenciasInvestigador v) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(v), true));
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
    public ResponseEntity editar(@RequestBody EvidenciasInvestigador v, @PathVariable("id") int id) {
        try {
            v.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(v), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByEvidencia/{id_evidencia}"})
    public ResponseEntity listarByIdEvidencia(@PathVariable("id_evidencia") int id_evidencia) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdEvidencia(id_evidencia), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

}
