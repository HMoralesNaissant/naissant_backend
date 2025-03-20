/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Repository.EmpresaRepositorio;
import com.naissant.naissantapp.Entity.Empresa;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.EmpresaService;
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
public class EmpresaServiceImp implements EmpresaService{
    
    private EmpresaRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService filesService;
    private final String filesPath;
    
    @Autowired
    public EmpresaServiceImp(
            EmpresaRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService filesService,
            @Value("${filesdir.company_logo}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Empresa> listar() {
        return repositorio.findAll();
    }

    @Override
    public Empresa listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Empresa add(Empresa e) {
        return repositorio.save(e);
    }

    @Override
    public Empresa edit(Empresa e) {
        return repositorio.save(e);
    }

    @Override
    public Empresa delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectosFile saveFotoPerfil(Integer empresaId,
            MultipartFile[] files, String descripcion) throws IOException {

        Empresa empresa = repositorio.findById(empresaId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(empresa.getArchivoId())) {
                GenArchivos oldPhoto = filesService.listarId(empresa.getArchivoId());
                filesService.deleteFileById(oldPhoto.getId());
                empresa.setArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + empresaId).toString();
            GenArchivos fotoPerfil = filesService.saveFile( finalPath, file[0], descripcion, GenArchivosTypes.IMAGE);
            empresa.setArchivoId(fotoPerfil.getId());
            edit(empresa);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenArchivos> listarByNombreArchivo(String nombre_archivo) {
        return filesService.listarByNombreArchivo(nombre_archivo);
    }

    @Override
    public Resource downloadProfilePicture(Integer empresaId) {
        Empresa empresa = repositorio.getById(empresaId);
        if (empresa != null && empresa.getArchivoId() != null) {
            return filesService.downloadFile(empresa.getArchivoId().toString());
        }
        return null;
    }
}
