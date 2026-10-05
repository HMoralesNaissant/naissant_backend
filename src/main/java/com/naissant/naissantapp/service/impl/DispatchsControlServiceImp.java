/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.constants.GenFilesTypes;
import com.naissant.naissantapp.entity.DispatchsControl;
import com.naissant.naissantapp.entity.GenFiles;
import com.naissant.naissantapp.repository.DispatchsControlRepository;
import com.naissant.naissantapp.repository.GenFilesRepository;
import com.naissant.naissantapp.service.DispatchsControlService;
import com.naissant.naissantapp.service.GenFilesService;
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
public class DispatchsControlServiceImp implements DispatchsControlService{

    private DispatchsControlRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;

    @Autowired
    public DispatchsControlServiceImp(
            DispatchsControlRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.dispatch_photos}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }

    @Override
    public List<DispatchsControl> listar() {
        return repository.findAll();
    }

    @Override
    public DispatchsControl listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public DispatchsControl add(DispatchsControl d) {
        return repository.save(d);
    }

    @Override
    public DispatchsControl edit(DispatchsControl d) {
        return repository.save(d);
    }
    
    @Override
    public List<DispatchsControl> listarByIdInvoice(int id_invoice) {
        return repository.findByInvoiceId_Id(id_invoice);
    }

    @Override
    public List<DispatchsControl> listarByVerified(char verified) {
        return repository.findByVerified(verified);
    }

    @Override
    public List<DispatchsControl> listarByDispatched(char dispatched) {
        return repository.findByDispatched(dispatched);
    }

    @Override
    public DispatchsControl delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectsFile savePhotoProfile(Integer dispatchId,
                                         MultipartFile[] files, String description) throws IOException {

        DispatchsControl dispatchsControl = repository.findById(dispatchId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(dispatchsControl.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(dispatchsControl.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                dispatchsControl.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + dispatchId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            dispatchsControl.setFileId(photoProfile.getId());
            edit(dispatchsControl);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }

    @Override
    public Resource downloadProfilePicture(Integer dispatchId) {
        DispatchsControl dispatchsControl = repository.getById(dispatchId);
        if (dispatchsControl != null && dispatchsControl.getFileId() != null) {
            return filesService.downloadFile(dispatchsControl.getFileId().toString());
        }
        return null;
    }
}
