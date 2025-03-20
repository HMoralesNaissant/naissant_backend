/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.ProyectosAprobados;
import com.naissant.naissantapp.Service.ProyectosAprobadosService;
import com.naissant.naissantapp.domain.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping({"/proyaprobados"})

public class ProyectosAprobadosController {

    @Autowired
    ProyectosAprobadosService service;

    private final Logger LOG = LoggerFactory.getLogger(ProyectosAprobadosController.class);

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
    public ResponseEntity agregar(@RequestBody ProyectosAprobados p) {
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
    public ResponseEntity editar(@RequestBody ProyectosAprobados p, @PathVariable("id") int id) {
        try {
            p.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(p), true));
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
    
    @GetMapping(path = {"/findByVbBioetico/{vb_bioetico}"})
    public ResponseEntity listarByVbBioetico(@PathVariable("vb_bioetico") char vb_bioetico) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByVbBioetico(vb_bioetico), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByVbCientifico/{vb_cientifico}"})
    public ResponseEntity listarByVbCientifico(@PathVariable("vb_cientifico") char vb_cientifico) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByVbCientifico(vb_cientifico), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    @GetMapping(path = {"/findByAcuerdoCientifico/{acuerdo_cientifico}"})
    public ResponseEntity listarByAcuerdoCientifico(@PathVariable("acuerdo_cientifico") char acuerdo_cientifico) {
        try {
            return ResponseEntity.ok(new ResponseDto(service.listarByAcuerdoCientifico(acuerdo_cientifico), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
    
    @PostMapping(path= "/{proyectosaprob_id}/file/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "proyectosaprob_id") Integer proyectosaprobId,
            @RequestParam("descripcion") String descripcion) {

        try {
            return ResponseEntity.ok().body(service.saveArchivo(proyectosaprobId, files, descripcion));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }
    
    @PostMapping(path= "/{proyectosaprob_id}/file/uploadAcuerdo", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFilesAcuerdo(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "proyectosaprob_id") Integer proyectosaprobId,
            @RequestParam("descripcion") String descripcion) {

        try {
            return ResponseEntity.ok().body(service.saveArchivoAcuerdo(proyectosaprobId, files, descripcion));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }
    
    @PostMapping(path= "/{proyectosaprob_id}/file/uploadBioetica", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFilesBioetica(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "proyectosaprob_id") Integer proyectosaprobId,
            @RequestParam("descripcion") String descripcion) {

        try {
            return ResponseEntity.ok().body(service.saveArchivoBioetica(proyectosaprobId, files, descripcion));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }
    
    @GetMapping("/{proyectosaprob_id}/file/{descripcion}")
    public ResponseEntity getFile(
            @PathVariable(name = "proyectosaprob_id") Integer proyectosaprobId,
            @PathVariable String descripcion) {
        try {
            Resource file = service.downloadFile(proyectosaprobId, descripcion);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
    
}
