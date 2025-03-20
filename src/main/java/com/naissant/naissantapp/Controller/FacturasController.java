/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Facturas;
import com.naissant.naissantapp.Service.FacturasService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/facturas"})

public class FacturasController {

    @Autowired
    FacturasService service;

    private final Logger LOG = LoggerFactory.getLogger(FacturasController.class);

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
    public ResponseEntity agregar(@RequestBody Facturas f) {
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
    public ResponseEntity editar(@RequestBody Facturas f, @PathVariable("id") int id) {
        try {
            f.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(f), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByNumFactura/{num_factura}"})
    public ResponseEntity listarByNumFactura(@PathVariable("num_factura") Double num_factura) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByNumFactura(num_factura), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByPaciente/{id_paciente}"})
    public ResponseEntity listarByIdPaciente(@PathVariable("id_paciente") int id_paciente) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdPaciente(id_paciente), true));
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

    @GetMapping(path = {"/findByFormaPago/{id_forma_pago}"})
    public ResponseEntity listarByIdFormaPago(@PathVariable("id_forma_pago") int id_forma_pago) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdFormaPago(id_forma_pago), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
