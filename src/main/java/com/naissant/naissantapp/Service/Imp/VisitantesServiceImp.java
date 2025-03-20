/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Repository.VisitantesRepositorio;
import com.naissant.naissantapp.Entity.Visitantes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.VisitantesService;
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
public class VisitantesServiceImp implements VisitantesService{
    
    private VisitantesRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService filesService;
    private final String filesPath;
    
    @Autowired
    public VisitantesServiceImp(
            VisitantesRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService filesService,
            @Value("${filesdir.photos_visit}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Visitantes> listar() {
        return repositorio.findAll();
    }

    @Override
    public Visitantes listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Visitantes add(Visitantes v) {
        return repositorio.save(v);
    }

    @Override
    public Visitantes edit(Visitantes v) {
        return repositorio.save(v);
    }
    
    @Override
    public List<Visitantes> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }

    @Override
    public Visitantes delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectosFile saveFotoVisita(Integer visitanteId,
            MultipartFile[] files, String descripcion) throws IOException {

        Visitantes visitante = repositorio.findById(visitanteId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(visitante.getArchivoId())) {
                GenArchivos oldPhoto = filesService.listarId(visitante.getArchivoId());
                filesService.deleteFileById(oldPhoto.getId());
                visitante.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + visitanteId).toString();
            GenArchivos fotoPerfil = filesService.saveFile( finalPath, file[0], descripcion, GenArchivosTypes.IMAGE);
            visitante.setArchivoId(fotoPerfil.getId());
            edit(visitante);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenArchivos> listarByNombreArchivo(String nombre_archivo) {
        return filesService.listarByNombreArchivo(nombre_archivo);
    }

    @Override
    public Resource downloadPictureVisit(Integer visitanteId) {
        Visitantes visitante = repositorio.getById(visitanteId);
        if (visitante != null && visitante.getArchivoId() != null) {
            return filesService.downloadFile(visitante.getArchivoId().toString());
        }
        return null;
    }
}
