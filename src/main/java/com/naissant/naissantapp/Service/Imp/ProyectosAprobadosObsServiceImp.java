/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Entity.ProyectosAprobadosObs;
import com.naissant.naissantapp.Repository.ProyectosAprobadosObsRepositorio;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.GenArchivosService;
import com.naissant.naissantapp.Service.ProyectosAprobadosObsService;
import java.nio.file.Paths;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProyectosAprobadosObsServiceImp implements ProyectosAprobadosObsService{
        
    private ProyectosAprobadosObsRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService archivosService;
    private final String filesPath;
    
    @Autowired
    public ProyectosAprobadosObsServiceImp(
            ProyectosAprobadosObsRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.approval_acts}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.archivosService = archivosService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<ProyectosAprobadosObs> listar() {
        return repositorio.findAll();
    }

    @Override
    public ProyectosAprobadosObs listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProyectosAprobadosObs add(ProyectosAprobadosObs p) {
        return repositorio.save(p);
    }

    @Override
    public ProyectosAprobadosObs edit(ProyectosAprobadosObs p) {
        return repositorio.save(p);
    }
    
    @Override
    public List<ProyectosAprobadosObs> listarByIdProyectoAprob(int id_proyecto_aprob) {
        return repositorio.findByProyectoAprobId_Id(id_proyecto_aprob);
    }
    
    @Override
    public ProyectosAprobadosObs delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public ProyectosFile saveArchivo(Integer proyectosaprobobsId,
            MultipartFile[] files, String descripcion) throws IOException {

        ProyectosAprobadosObs proyectosaprobobs = repositorio.findById(proyectosaprobobsId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(proyectosaprobobs.getArchivoId())) {
                GenArchivos oldFile = archivosService.listarId(proyectosaprobobs.getArchivoId());
                archivosService.deleteFileById(oldFile.getId());
                proyectosaprobobs.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath+"_obs", "" + proyectosaprobobsId).toString();
            GenArchivos archivo = archivosService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.DOCUMENT);
            proyectosaprobobs.setArchivoId(archivo.getId());
            edit(proyectosaprobobs);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
}
