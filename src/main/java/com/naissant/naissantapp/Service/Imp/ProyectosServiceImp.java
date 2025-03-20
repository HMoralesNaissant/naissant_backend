/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Entity.Proyectos;
import com.naissant.naissantapp.Repository.ProyectosRepositorio;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.GenArchivosService;
import com.naissant.naissantapp.Service.ProyectosService;
import java.nio.file.Paths;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProyectosServiceImp implements ProyectosService {

    private final ProyectosRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService fileService;
    private final String filesPath;

    @Autowired
    public ProyectosServiceImp(
            ProyectosRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.projects}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.fileService = archivosService;
        this.filesPath = filesPath;
    }

    @Override
    public List<Proyectos> listar() {
        return repositorio.findAll();
    }

    @Override
    public Proyectos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Proyectos add(Proyectos p) {
        return repositorio.save(p);
    }

    @Override
    public Proyectos edit(Proyectos p) {
        return repositorio.save(p);
    }

    @Override
    public List<Proyectos> listarByIdEmpresa(int id_empresa) {
        return repositorio.findByEmpresaId_Id(id_empresa);
    }

    @Override
    public List<Proyectos> listarByIdGrupoInvestigacion(int id_grupo_investigacion) {
        return repositorio.findByGrupoInvestigacionId_Id(id_grupo_investigacion);
    }

    @Override
    public Proyectos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectosFile saveArchivo(Integer proyectoId,
            MultipartFile[] files, String descripcion) throws IOException {
        
        Proyectos proyecto = repositorio.findById(proyectoId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(proyecto.getArchivoId())) {
                GenArchivos oldFile = fileService.listarId(proyecto.getArchivoId());
                fileService.deleteFileById(oldFile.getId());
                proyecto.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + proyectoId).toString();
            GenArchivos archivo = fileService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            proyecto.setArchivoId(archivo.getId());
            edit(proyecto);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public Resource downloadFile(Integer proyectoId) {
        Proyectos proyecto = repositorio.getById(proyectoId);
        if (proyecto != null && proyecto.getArchivoId() != null) {
            return fileService.downloadFile(proyecto.getArchivoId().toString());
        }
        return null;
    }
    
}
