/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.ProyectosAprobadosRepositorio;
import com.naissant.naissantapp.Entity.ProyectosAprobados;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.GenArchivosService;
import com.naissant.naissantapp.Service.ProyectosAprobadosService;
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
public class ProyectosAprobadosServiceImp implements ProyectosAprobadosService{
    
    private ProyectosAprobadosRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService archivosService;
    private final String filesPath;
    
    @Autowired
    public ProyectosAprobadosServiceImp(
            ProyectosAprobadosRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.approval_acts}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.archivosService = archivosService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<ProyectosAprobados> listar() {
        return repositorio.findAll();
    }

    @Override
    public ProyectosAprobados listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProyectosAprobados add(ProyectosAprobados p) {
        return repositorio.save(p);
    }

    @Override
    public ProyectosAprobados edit(ProyectosAprobados p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<ProyectosAprobados> listarByIdProyecto(int id_proyecto) {
        return repositorio.findByProyectoId_Id(id_proyecto);
    }
    
    @Override
    public List<ProyectosAprobados> listarByVbBioetico(char vb_bioetico) {
        return repositorio.findByVbBioetico(vb_bioetico);
    }
    
    @Override
    public List<ProyectosAprobados> listarByVbCientifico(char vb_cientifico) {
        return repositorio.findByVbCientifico(vb_cientifico);
    }
    
    @Override
    public List<ProyectosAprobados> listarByAcuerdoCientifico(char acuerdo_cientifico) {
        return repositorio.findByAcuerdoCientifico(acuerdo_cientifico);
    }

    @Override
    public ProyectosAprobados delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public ProyectosFile saveArchivo(Integer proyectosaprobId,
            MultipartFile[] files, String descripcion) throws IOException {

        ProyectosAprobados proyectosaprob = repositorio.findById(proyectosaprobId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(proyectosaprob.getArchivoCieId())) {
                GenArchivos oldFile = archivosService.listarId(proyectosaprob.getArchivoCieId());
                archivosService.deleteFileById(oldFile.getId());
                proyectosaprob.setArchivoCieId(null);
            }
            String finalPath = Paths.get(filesPath+"_cie", "" + proyectosaprobId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            proyectosaprob.setArchivoCieId(archivo.getId());
            edit(proyectosaprob);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public ProyectosFile saveArchivoAcuerdo(Integer proyectosaprobId,
            MultipartFile[] files, String descripcion) throws IOException {

        ProyectosAprobados proyectosaprob = repositorio.findById(proyectosaprobId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(proyectosaprob.getArchivoAcuId())) {
                GenArchivos oldFile = archivosService.listarId(proyectosaprob.getArchivoAcuId());
                archivosService.deleteFileById(oldFile.getId());
                proyectosaprob.setArchivoAcuId(null);
            }
            String finalPath = Paths.get(filesPath+"_acu", "" + proyectosaprobId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            proyectosaprob.setArchivoAcuId(archivo.getId());
            edit(proyectosaprob);
        } 
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public ProyectosFile saveArchivoBioetica(Integer proyectosaprobId,
            MultipartFile[] files, String descripcion) throws IOException {

        ProyectosAprobados proyectosaprob = repositorio.findById(proyectosaprobId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(proyectosaprob.getArchivoBioId())) {
                GenArchivos oldFile = archivosService.listarId(proyectosaprob.getArchivoBioId());
                archivosService.deleteFileById(oldFile.getId());
                proyectosaprob.setArchivoBioId(null);
            }
            String finalPath = Paths.get(filesPath+"_bio", "" + proyectosaprobId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            proyectosaprob.setArchivoBioId(archivo.getId());
            edit(proyectosaprob);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public Resource downloadFile(Integer proyectosaprobId, String descripcion) {
        ProyectosAprobados proyectosaprob = repositorio.getById(proyectosaprobId);
        
        if (proyectosaprob != null && ("vbCientifico".equals(descripcion))) {
            return archivosService.downloadFile(proyectosaprob.getArchivoCieId().toString());
        }else{
            if (proyectosaprob != null && "vbBioetico".equals(descripcion)) {
                return archivosService.downloadFile(proyectosaprob.getArchivoBioId().toString());
            }else{
                if (proyectosaprob != null && "actoAdmin".equals(descripcion)) {
                    return archivosService.downloadFile(proyectosaprob.getArchivoAcuId().toString());
                }
            }
        }
        return null;
    }
}
