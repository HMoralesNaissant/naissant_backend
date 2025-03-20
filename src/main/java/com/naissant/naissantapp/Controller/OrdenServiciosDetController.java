/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.OrdenServiciosDet;
import com.naissant.naissantapp.Service.OrdenServiciosDetService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/ordenServiciosDet"})

public class OrdenServiciosDetController {

    @Autowired
    OrdenServiciosDetService service;

    private final Logger LOG = LoggerFactory.getLogger(OrdenServiciosDetController.class);

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
    public ResponseEntity agregar(@RequestBody OrdenServiciosDet o) {
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
    public ResponseEntity editar(@RequestBody OrdenServiciosDet o, @PathVariable("id") int id) {
        try {
            o.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(o), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByOrdenServicio/{id_orden_servicio}"})
    public ResponseEntity listarByIdOrdenServicio(@PathVariable("id_orden_servicio") int id_orden_servicio) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdOrdenServicio(id_orden_servicio), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByConcepto/{id_concepto}"})
    public ResponseEntity listarByIdConcepto(@PathVariable("id_concepto") int id_concepto) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdConcepto(id_concepto), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByProcedimiento/{id_Procedimiento}"})
    public ResponseEntity listarByIdProcedimiento(@PathVariable("id_procedimiento") int id_Procedimiento) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdProcedimiento(id_Procedimiento), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
