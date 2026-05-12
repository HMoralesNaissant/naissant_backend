/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.Company;
import com.naissant.naissantapp.Entity.GenFiles;
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
import com.naissant.naissantapp.Repository.CompanyRepository;
import com.naissant.naissantapp.Service.CompanyService;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.GenFilesService;


@Service
public class CompanyServiceImp implements CompanyService{
    
    private CompanyRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;
    
    @Autowired
    public CompanyServiceImp(
            CompanyRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.company_logo}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Company> listar() {
        return repository.findAll();
    }

    @Override
    public Company listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Company add(Company c) {
        return repository.save(c);
    }

    @Override
    public Company edit(Company c) {
        return repository.save(c);
    }

    @Override
    public Company delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectsFile savePhotoProfile(Integer companyId,
            MultipartFile[] files, String description) throws IOException {

        Company company = repository.findById(companyId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(company.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(company.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                company.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + companyId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            company.setFileId(photoProfile.getId());
            edit(company);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenFiles> listarByNameFile(String name_file) {
        return filesService.listarByNameFile(name_file);
    }

    @Override
    public Resource downloadProfilePicture(Integer companyId) {
        Company company = repository.getById(companyId);
        if (company != null && company.getFileId() != null) {
            return filesService.downloadFile(company.getFileId().toString());
        }
        return null;
    }
}
