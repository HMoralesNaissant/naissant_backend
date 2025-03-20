/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Controller;

import com.naissant.naissantapp.Entity.Usuarios;
import com.naissant.naissantapp.Service.UsuariosService;
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
@RequestMapping({"/usuarios"})

public class UsuariosController {

    @Autowired
    UsuariosService service;

    private final Logger LOG = LoggerFactory.getLogger(UsuariosController.class);

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
    public ResponseEntity agregar(@RequestBody Usuarios u) {
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
    public ResponseEntity editar(@RequestBody Usuarios u, @PathVariable("id") int id) {
        try {
            u.setId(id);
            return ResponseEntity.ok(new ResponseDto(service.edit(u), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByPersona/{id_persona}"})
    public ResponseEntity listarByIdPersona(@PathVariable("id_persona") int id_persona) {
        try {
            return ResponseEntity.ok().body(new ResponseDto(service.listarByIdPersona(id_persona), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @GetMapping(path = {"/findByUsuario/{usuario}"})
    public ResponseEntity listarByUsuario(@PathVariable("usuario") String usuario) {
        try {
            return ResponseEntity.ok().body(new ResponseDto(service.listarByUsuario(usuario), true));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }

    @PostMapping(path = "/{usuario_id}/photo/upload", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity uploadFiles(
            @RequestParam("files") MultipartFile[] files,
            @PathVariable(name = "usuario_id") Integer usuarioId,
            @RequestParam("descripcion") String descripcion) {

        try {
            return ResponseEntity.ok().body(service.saveFotoPerfil(usuarioId, files, descripcion));
        } catch (Exception e) {
            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("Fallo al subir los archivos", false));
        }
    }

    @GetMapping("/{usuario_id}/photo")
    public ResponseEntity getProfilePicture(@PathVariable(name = "usuario_id") Integer usuarioId) {
        try {
            Resource file = service.downloadProfilePicture(usuarioId);
            return ResponseEntity.status(HttpStatus.OK).body(file);
        } catch (Exception e) {

            LOG.error("No se pudo completar ", e);
            return ResponseEntity.internalServerError()
                    .body(new ResponseDto("No se pudo completar", false));
        }
    }
}
