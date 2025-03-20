/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ArqueosCajasDet;
import com.naissant.naissantapp.Service.ArqueosCajasDetService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/arqueosCajasDet"})

public class ArqueosCajasDetController {

    @Autowired
    ArqueosCajasDetService service;

    private final Logger LOG = LoggerFactory.getLogger(ArqueosCajasDetController.class);

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
    public ResponseEntity agregar(@RequestBody ArqueosCajasDet a) {
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
    public ResponseEntity editar(@RequestBody ArqueosCajasDet a, @PathVariable("id") int id) {
        try {
            a.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(a), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByArqueoCaja/{id_arqueo_caja}"})
    public ResponseEntity listarByIdArqueoCaja(@PathVariable("id_arqueo_caja") int id_arqueo_caja) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdArqueoCaja(id_arqueo_caja), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByMedioPago/{id_medio_pago}"})
    public ResponseEntity listarByIdMedioPago(@PathVariable("id_medio_pago") int id_medio_pago) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdMedioPago(id_medio_pago), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
