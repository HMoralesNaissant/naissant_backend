/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Sucursal;
import com.naissant.naissantapp.Service.SucursalService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/sucursal"})

public class SucursalController {

    @Autowired
    SucursalService service;

    private final Logger LOG = LoggerFactory.getLogger(SucursalController.class);

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
    public ResponseEntity agregar(@RequestBody Sucursal s) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(s), true));
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
    public ResponseEntity editar(@RequestBody Sucursal s, @PathVariable("id") int id) {
        try {
            s.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(s), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByEmpresa/{id_empresa}"})
    public ResponseEntity listarByIdEmpresa(@PathVariable("id_empresa") int id_empresa) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdEmpresa(id_empresa), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
