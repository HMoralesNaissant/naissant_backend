/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 * */
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ProyectosInvestigador;
import com.naissant.naissantapp.Service.ProyectosInvestigadorService;
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
@RequestMapping({"/proyectosInv"})

public class ProyectosInvestigadorController {

    @Autowired
    ProyectosInvestigadorService service;

    private final Logger LOG = LoggerFactory.getLogger(ProyectosInvestigadorController.class);

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
    public ResponseEntity agregar(@RequestBody ProyectosInvestigador p) {
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
    public ResponseEntity editar(@RequestBody ProyectosInvestigador p, @PathVariable("id") int id) {
        try {
            p.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(p), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByProyecto/{id_proyecto}"})
    public ResponseEntity listarByIdProyecto(@PathVariable("id_proyecto") int id_proyecto) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdProyecto(id_proyecto), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

}
