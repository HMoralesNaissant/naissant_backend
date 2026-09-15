/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ConveyorAccounts;
import com.naissant.naissantapp.Service.ConveyorAccountsService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/conveyorAccounts"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class ConveyorAccountsController {

    @Autowired
    ConveyorAccountsService service;

    private final Logger LOG = LoggerFactory.getLogger(ConveyorAccountsController.class);

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
    public ResponseEntity agregar(@RequestBody ConveyorAccounts c) {
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
    public ResponseEntity editar(@RequestBody ConveyorAccounts c, @PathVariable("id") int id) {
        try {
            c.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(c), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByConveyor/{id_conveyor}"})
    public ResponseEntity listarByIdConveyor(@PathVariable("id_conveyor") int id_conveyor) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdConveyor(id_conveyor), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
