/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Disabilities;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.DisabilitiesService;
import com.naissant.naissantapp.Repository.DisabilitiesRepository;
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
public class DisabilitiesServiceImp implements DisabilitiesService{
    
    private DisabilitiesRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;
    
    @Autowired
    public DisabilitiesServiceImp(
            DisabilitiesRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.disability_support}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Disabilities> listar() {
        return repository.findAll();
    }

    @Override
    public Disabilities listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Disabilities add(Disabilities d) {
        return repository.save(d);
    }

    @Override
    public Disabilities edit(Disabilities d) {
        return repository.save(d);
    }
    
    @Override
    public List<Disabilities> listarByIdEmployee(int id_employee) {
        return repository.findByEmployeeId_Id(id_employee);
    }

    @Override
    public Disabilities delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectsFile saveSupport(Integer disabilityId,
            MultipartFile[] files, String description) throws IOException {

        Disabilities disability = repository.findById(disabilityId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(disability.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(disability.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                disability.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + disabilityId).toString();
            GenFiles photoSupport = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            disability.setFileId(photoSupport.getId());
            edit(disability);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenFiles> listarByNameFile(String name_file) {
        return filesService.listarByNameFile(name_file);
    }

    @Override
    public Resource downloadSupport(Integer disabilityId) {
        Disabilities disability = repository.getById(disabilityId);
        if (disability != null && disability.getFileId() != null) {
            return filesService.downloadFile(disability.getFileId().toString());
        }
        return null;
    }
}
