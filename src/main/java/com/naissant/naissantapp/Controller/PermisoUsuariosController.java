/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.PermisoUsuarios;
import com.naissant.naissantapp.Service.PermisoUsuariosService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/permisousuarios"})

public class PermisoUsuariosController {

    @Autowired
    PermisoUsuariosService service;

    private final Logger LOG = LoggerFactory.getLogger(PermisoUsuariosController.class);

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
    public ResponseEntity agregar(@RequestBody PermisoUsuarios p) {
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
    public ResponseEntity editar(@RequestBody PermisoUsuarios p, @PathVariable("id") int id) {
        try {
            p.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(p), true));
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

    @GetMapping(path = {"/findByArea/{id_area}"})
    public ResponseEntity listarByIdArea(@PathVariable("id_area") int id_area) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdArea(id_area), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
