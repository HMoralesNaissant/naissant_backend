/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.Carrier;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Repository.CarrierRepository;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.CarrierService;
import com.naissant.naissantapp.Service.GenFilesService;
import com.naissant.naissantapp.message.ProyectsFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

@Service
public class CarrierServiceImp implements CarrierService{

    private CarrierRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;

    @Autowired
    public CarrierServiceImp(
            CarrierRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.company_logo}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<Carrier> listar() {
        return repository.findAll();
    }

    @Override
    public Carrier listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Carrier add(Carrier c) {
        return repository.save(c);
    }

    @Override
    public Carrier edit(Carrier c) {
        return repository.save(c);
    }
    
    @Override
    public List<Carrier> listarByIdCompany(int id_company) {
        return repository.findByCompanyId_Id(id_company);
    }

    @Override
    public Carrier delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectsFile savePhotoProfile(Integer carrierId, MultipartFile[] files, String description) throws IOException {

        Carrier carrier = repository.findById(carrierId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(carrier.getPhotoFileId())) {
                GenFiles oldPhoto = filesService.listarId(carrier.getPhotoFileId());
                filesService.deleteFileById(oldPhoto.getId());
                carrier.setPhotoFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + carrierId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            carrier.setPhotoFileId(photoProfile.getId());
            edit(carrier);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }

    @Override
    public Resource downloadProfilePicture(Integer carrierId) {
        Carrier carrier = repository.getById(carrierId);
        if (carrier != null && carrier.getPhotoFileId() != null) {
            return filesService.downloadFile(carrier.getPhotoFileId().toString());
        }
        return null;
    }
}
