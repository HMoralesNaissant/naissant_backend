/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Cuentasxcobrar;
import com.naissant.naissantapp.Service.CuentasxcobrarService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/cuentasxcobrar"})

public class CuentasxcobrarController {

    @Autowired
    CuentasxcobrarService service;

    private final Logger LOG = LoggerFactory.getLogger(CuentasxcobrarController.class);

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
    public ResponseEntity agregar(@RequestBody Cuentasxcobrar c) {
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
    public ResponseEntity editar(@RequestBody Cuentasxcobrar c, @PathVariable("id") int id) {
        try {
            c.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(c), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByNumCxc/{num_cxc}"})
    public ResponseEntity listarByNumCxc(@PathVariable("num_cxc") Double num_cxc) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByNumCxc(num_cxc), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByFactura/{id_factura}"})
    public ResponseEntity listarByIdFactura(@PathVariable("id_factura") int id_factura) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdFactura(id_factura), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByEstudiante/{id_estudiante}"})
    public ResponseEntity listarByIdEstudiante(@PathVariable("id_estudiante") int id_estudiante) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdEstudiante(id_estudiante), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByAnoSemestre/{id_ano_semestre}"})
    public ResponseEntity listarByIdAnoSemestre(@PathVariable("id_ano_semestre") int id_ano_semestre) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdAnoSemestre(id_ano_semestre), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
