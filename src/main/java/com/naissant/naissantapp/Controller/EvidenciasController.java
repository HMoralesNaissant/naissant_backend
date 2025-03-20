/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Evidencias;
import com.naissant.naissantapp.Service.EvidenciasService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"/evidencias"})

public class EvidenciasController {

    @Autowired
    EvidenciasService service;

    private final Logger LOG = LoggerFactory.getLogger(EvidenciasController.class);

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
    public ResponseEntity agregar(@RequestBody Evidencias u) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.add(u), true));
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
    public ResponseEntity editar(@RequestBody Evidencias u, @PathVariable("id") int id) {
        try {
            u.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(u), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByProyecto/{id_proyecto}"})
    public ResponseEntity listarByIdProyecto(@PathVariable("id_proyecto") int id_proyecto) {
        
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdProyecto(id_proyecto), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByGrupoInv/{id_grupo_investigacion}"})
    public ResponseEntity listarByIdGrupoInvestigacion(@PathVariable("id_grupo_investigacion") int id_grupo_investigacion) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByIdGrupoInvestigacion(id_grupo_investigacion), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @PostMapping(path= "/{evidencia_id}/file/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "evidencia_id") Integer evidenciaId,
            @RequestParam("descripcion") String descripcion) {

        try {
            return ResponseEntity.ok().body(service.saveArchivo(evidenciaId, files, descripcion));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }
    
    @GetMapping("/{evidencia_id}/file")
    public ResponseEntity getFile(@PathVariable(name = "evidencia_id") Integer evidenciaId) {
        try {
            Resource file = service.downloadFile(evidenciaId);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
}
