/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Repository.VisitantesRepositorio;
import com.naissant.naissantapp.Entity.Visitantes;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Service.VisitantesService;
import java.nio.file.Paths;
import java.util.List;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.GenFilesService;

@Service
public class VisitantesServiceImp implements VisitantesService{
    
    private VisitantesRepositorio repositorio;
    private final GenFilesRepository fileRepositorio;
    private final GenFilesService filesService;
    private final String filesPath;
    
    @Autowired
    public VisitantesServiceImp(
            VisitantesRepositorio repositorio,
            GenFilesRepository fileRepositorio,
            GenFilesService filesService,
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
    public ProyectsFile saveFotoVisita(Integer visitanteId,
            MultipartFile[] files, String descripcion) throws IOException {

        Visitantes visitante = repositorio.findById(visitanteId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(visitante.getArchivoId())) {
                GenFiles oldPhoto = filesService.listarId(visitante.getArchivoId());
                filesService.deleteFileById(oldPhoto.getId());
                visitante.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + visitanteId).toString();
            GenFiles fotoPerfil = filesService.saveFile(finalPath, file[0], descripcion, GenFilesTypes.IMAGE);
            visitante.setArchivoId(fotoPerfil.getId());
            edit(visitante);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenFiles> listarByNombreArchivo(String name_file) {
        return filesService.listarByNameFile(name_file);
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
