/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.DispatchsControl;
import com.naissant.naissantapp.Service.DispatchsControlService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"/dispatchsControl"})
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

public class DispatchsControlController {

    @Autowired
    DispatchsControlService service;

    private final Logger LOG = LoggerFactory.getLogger(DispatchsControlController.class);

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
    public ResponseEntity agregar(@RequestBody DispatchsControl d) {
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
    public ResponseEntity editar(@RequestBody DispatchsControl d, @PathVariable("id") int id) {
        try {
            d.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(d), true));
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

    @GetMapping(path = {"/findByVerified/{verified}"})
    public ResponseEntity listarByVerified(@PathVariable("verified") char verified) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByVerified(verified), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByDispatched/{dispatched}"})
    public ResponseEntity listarByDispatched(@PathVariable("dispatched") char dispatched) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByDispatched(dispatched), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @PostMapping(path = "/{dispatch_id}/photo/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "dispatch_id") Integer dispatchId,
            @RequestParam("description") String description) {

        try {
            return ResponseEntity.ok().body(service.savePhotoProfile(dispatchId, files, description));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }

    @GetMapping("/{dispatch_id}/photo")
    public ResponseEntity getProfilePicture(@PathVariable(name = "dispatch_id") Integer dispatchId) {
        try {
            Resource file = service.downloadProfilePicture(dispatchId);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
