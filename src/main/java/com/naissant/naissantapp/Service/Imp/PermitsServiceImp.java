/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Permits;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.PermitsService;
import com.naissant.naissantapp.Repository.PermitsRepository;
import com.naissant.naissantapp.Service.GenFilesService;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class PermitsServiceImp implements PermitsService{
    
    private PermitsRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;
    
    @Autowired
    public PermitsServiceImp(
            PermitsRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.permit_support}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Permits> listar() {
        return repository.findAll();
    }

    @Override
    public Permits listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Permits add(Permits p) {
        return repository.save(p);
    }

    @Override
    public Permits edit(Permits p) {
        return repository.save(p);
    }
    
    @Override
    public List<Permits> listarByIdEmployee(int id_employee) {
        return repository.findByEmployeeId_Id(id_employee);
    }

    @Override
    public Permits delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectsFile saveSupport(Integer permitId,
            MultipartFile[] files, String description) throws IOException {

        Permits permit = repository.findById(permitId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(permit.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(permit.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                permit.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + permitId).toString();
            GenFiles photoSupport = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            permit.setFileId(photoSupport.getId());
            edit(permit);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenFiles> listarByNameFile(String name_file) {
        return filesService.listarByNameFile(name_file);
    }

    @Override
    public Resource downloadSupport(Integer permitId) {
        Permits permit = repository.getById(permitId);
        if (permit != null && permit.getFileId() != null) {
            return filesService.downloadFile(permit.getFileId().toString());
        }
        return null;
    }
}
