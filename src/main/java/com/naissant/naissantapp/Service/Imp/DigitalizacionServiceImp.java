/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Repository.DigitalizacionRepositorio;
import com.naissant.naissantapp.Entity.Digitalizacion;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.DigitalizacionService;
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
public class DigitalizacionServiceImp implements DigitalizacionService {

    private DigitalizacionRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService archivosService;
    private final String filesPath;

    @Autowired
    public DigitalizacionServiceImp(
            DigitalizacionRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.digitalization}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.archivosService = archivosService;
        this.filesPath = filesPath;
    }

    @Override
    public List<Digitalizacion> listar() {
        return repositorio.findAll();
    }

    @Override
    public Digitalizacion listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Digitalizacion add(Digitalizacion d) {
        return repositorio.save(d);
    }

    @Override
    public Digitalizacion edit(Digitalizacion d) {
        return repositorio.save(d);
    }

    @Override
    public List<Digitalizacion> listarByIdEstudiante(int id_estudiante) {
        return repositorio.findByEstudianteId_Id(id_estudiante);
    }

    @Override
    public Digitalizacion delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectosFile saveArchivo(Integer digitalizacionId,
            MultipartFile[] files, String descripcion, String estudianteId) throws IOException {

        Digitalizacion digitalizacion = repositorio.getById(digitalizacionId);
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(digitalizacion.getArchivoId())) {
                GenArchivos oldFile = archivosService.listarId(digitalizacion.getArchivoId());
                archivosService.deleteFileById(oldFile.getId());
                digitalizacion.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + estudianteId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            digitalizacion.setArchivoId(archivo.getId());
            edit(digitalizacion);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public Resource downloadFile(Integer digitalizacionId) {
        Digitalizacion digitalizacion = repositorio.getById(digitalizacionId);
        if (digitalizacion != null && digitalizacion.getArchivoId() != null) {
            return archivosService.downloadFile(digitalizacion.getArchivoId().toString());
        }
        return null;
    }
}
