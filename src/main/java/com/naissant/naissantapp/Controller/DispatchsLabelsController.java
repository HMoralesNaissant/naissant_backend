/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.DispatchsLabels;
import com.naissant.naissantapp.Service.DispatchsLabelsService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/dispatchsLabels"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class DispatchsLabelsController {

    @Autowired
    DispatchsLabelsService service;

    private final Logger LOG = LoggerFactory.getLogger(DispatchsLabelsController.class);

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
    public ResponseEntity agregar(@RequestBody DispatchsLabels d) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(d), true));
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
    public ResponseEntity editar(@RequestBody DispatchsLabels d, @PathVariable("id") int id) {
        try {
            d.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(d), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByDispatch/{id_dispatch}"})
    public ResponseEntity listarByIdDispactch(@PathVariable("id_dispatch") int id_dispatch) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdDispatch(id_dispatch), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByInvoice/{id_invoice}"})
    public ResponseEntity listarByIdInvoice(@PathVariable("id_invoice") int id_invoice) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdInvoice(id_invoice), true));
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

    @GetMapping(path = {"/findByConveyorAcc/{id_conveyor_acc}"})
    public ResponseEntity listarByIdConveyorAcc(@PathVariable("id_conveyor_acc") int id_conveyor_acc) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdConveyorAcc(id_conveyor_acc), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByOrigin/{id_origin}"})
    public ResponseEntity listarByIdOrigin(@PathVariable("id_origin") int id_origin) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdOrigin(id_origin), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByDestination/{id_destination}"})
    public ResponseEntity listarByIdDestination(@PathVariable("id_destination") int id_destination) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdDestination(id_destination), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
