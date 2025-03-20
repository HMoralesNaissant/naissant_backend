/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.MovimientosCajas;
import com.naissant.naissantapp.Service.MovimientosCajasService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/movimientosCajas"})

public class MovimientosCajasController {

    @Autowired
    MovimientosCajasService service;

    private final Logger LOG = LoggerFactory.getLogger(MovimientosCajasController.class);

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
    public ResponseEntity agregar(@RequestBody MovimientosCajas m) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(m), true));
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
    public ResponseEntity editar(@RequestBody MovimientosCajas m, @PathVariable("id") int id) {
        try {
            m.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(m), true));
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
