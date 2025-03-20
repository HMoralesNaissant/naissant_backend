/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ArqueosCajas;
import com.naissant.naissantapp.Service.ArqueosCajasService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/arqueosCajas"})

public class ArqueosCajasController {

    @Autowired
    ArqueosCajasService service;

    private final Logger LOG = LoggerFactory.getLogger(ArqueosCajasController.class);

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
    public ResponseEntity agregar(@RequestBody ArqueosCajas a) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(a), true));
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
    public ResponseEntity editar(@RequestBody ArqueosCajas a, @PathVariable("id") int id) {
        try {
            a.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(a), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findBySucursal/{id_sucursal}"})
    public ResponseEntity listarByIdSucursal(@PathVariable("id_sucursal") int id_sucursal) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdSucursal(id_sucursal), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByCaja/{id_caja}"})
    public ResponseEntity listarByIdCaja(@PathVariable("id_caja") int id_caja) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdCaja(id_caja), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByUsuario/{id_usuario}"})
    public ResponseEntity listarByIdUsuario(@PathVariable("id_usuario") int id_usuario) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdUsuario(id_usuario), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByNumArqueo/{num_arqueo}"})
    public ResponseEntity listarByNumArqueo(@PathVariable("num_arqueo") Double num_arqueo) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByNumArqueo(num_arqueo), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
