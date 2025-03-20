/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Repository.EvidenciasRepositorio;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Entity.Evidencias;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Service.EvidenciasService;
import com.naissant.naissantapp.Service.GenArchivosService;
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
public class EvidenciasServiceImp implements EvidenciasService{
   
    private EvidenciasRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService archivosService;
    private final String filesPath;
    
    @Autowired
    public EvidenciasServiceImp(
            EvidenciasRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.evidences}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.archivosService = archivosService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Evidencias> listar() {
        return repositorio.findAll();
    }

    @Override
    public Evidencias listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Evidencias add(Evidencias e) {
        return repositorio.save(e);
    }

    @Override
    public Evidencias edit(Evidencias e) {
        return repositorio.save(e);
    }
    
    @Override
    public List<Evidencias> listarByIdProyecto(int id_proyecto) {
        return repositorio.findByProyectoId_Id(id_proyecto);
    }
    
    @Override
    public List<Evidencias> listarByIdGrupoInvestigacion(int id_grupo_investigacion) {
        return repositorio.findByGrupoInvestigacionId_Id(id_grupo_investigacion);
    }

    @Override
    public Evidencias delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public ProyectosFile saveArchivo(Integer evidenciaId,
            MultipartFile[] files, String descripcion) throws IOException {

        Evidencias evidencia = repositorio.findById(evidenciaId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(evidencia.getArchivoId())) {
                GenArchivos oldFile = archivosService.listarId(evidencia.getArchivoId());
                archivosService.deleteFileById(oldFile.getId());
                evidencia.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + evidenciaId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            evidencia.setArchivoId(archivo.getId());
            edit(evidencia);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public Resource downloadFile(Integer evidenciaId) {
        Evidencias evidencia = repositorio.getById(evidenciaId);
        if (evidencia != null && evidencia.getArchivoId() != null) {
            return archivosService.downloadFile(evidencia.getArchivoId().toString());
        }
        return null;
    }
}
