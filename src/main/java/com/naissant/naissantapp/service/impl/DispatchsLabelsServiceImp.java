/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service.impl;

import com.naissant.naissantapp.service.Audit;
import com.naissant.naissantapp.constants.GenFilesTypes;
import com.naissant.naissantapp.entity.DispatchsLabels;
import com.naissant.naissantapp.entity.GenFiles;
import com.naissant.naissantapp.repository.DispatchsLabelsRepository;
import com.naissant.naissantapp.repository.GenFilesRepository;
import com.naissant.naissantapp.service.dispatching.CarriersDispatchersHandlerService;
import com.naissant.naissantapp.service.DispatchsLabelsService;
import com.naissant.naissantapp.service.GenFilesService;
import com.naissant.naissantapp.domain.DispatchBodyDto;
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
public class DispatchsLabelsServiceImp implements DispatchsLabelsService{

    private final CarriersDispatchersHandlerService dispatchersHandlerService;
    private DispatchsLabelsRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;

    @Autowired
    public DispatchsLabelsServiceImp(
            DispatchsLabelsRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.label_photos}") String filesPath, CarriersDispatchersHandlerService carriersDispatchersHandlerService) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
        this.dispatchersHandlerService = carriersDispatchersHandlerService;
    }
    
    @Override
    public List<DispatchsLabels> listar() {
        return repository.findAll();
    }

    @Override
    public DispatchsLabels listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public DispatchsLabels add(DispatchsLabels d) {
        DispatchsLabels saved =  repository.save(Audit.created(d));
        dispatchersHandlerService.handleDispatch(new DispatchBodyDto(saved));
        return saved;
    }

    @Override
    public DispatchsLabels edit(DispatchsLabels d) {
        return repository.save(Audit.updated(d));
    }
    
    @Override
    public List<DispatchsLabels> listarByIdDispatch(int id_dispatch) {
        return repository.findByDispatchId_Id(id_dispatch);
    }

    @Override
    public List<DispatchsLabels> listarByIdInvoice(int id_invoice) {
        return repository.findByInvoiceId_Id(id_invoice);
    }

    @Override
    public List<DispatchsLabels> listarByIdCarrier(int id_carrier) {
        return repository.findByCarrierId_Id(id_carrier);
    }

    @Override
    public List<DispatchsLabels> listarByIdCarrierAcc(int id_carrier_acc) {
        return repository.findByCarrierAccId_Id(id_carrier_acc);
    }

    @Override
    public List<DispatchsLabels> listarByIdOrigin(int id_origin) {
        return repository.findByOriginId_Id(id_origin);
    }

    @Override
    public List<DispatchsLabels> listarByIdDestination(int id_destination) {
        return repository.findByDestinationId_Id(id_destination);
    }

    @Override
    public DispatchsLabels delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectsFile savePhotoLabel(Integer labelId,MultipartFile[] files, String description) throws IOException {

        DispatchsLabels dispatchsLabels = repository.findById(labelId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(dispatchsLabels.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(dispatchsLabels.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                dispatchsLabels.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + labelId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            dispatchsLabels.setFileId(photoProfile.getId());
            edit(dispatchsLabels);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }

    @Override
    public Resource downloadLabelPicture(Integer labelId) {
        DispatchsLabels dispatchsLabels = repository.getById(labelId);
        if (dispatchsLabels != null && dispatchsLabels.getFileId() != null) {
            return filesService.downloadFile(dispatchsLabels.getFileId().toString());
        }
        return null;
    }
}
