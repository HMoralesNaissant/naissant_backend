/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.FacturasPagos;
import com.naissant.naissantapp.Service.FacturasPagosService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/facturasPagos"})

public class FacturasPagosController {

    @Autowired
    FacturasPagosService service;

    private final Logger LOG = LoggerFactory.getLogger(FacturasPagosController.class);

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
    public ResponseEntity agregar(@RequestBody FacturasPagos f) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(f), true));
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
    public ResponseEntity editar(@RequestBody FacturasPagos f, @PathVariable("id") int id) {
        try {
            f.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(f), true));
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
