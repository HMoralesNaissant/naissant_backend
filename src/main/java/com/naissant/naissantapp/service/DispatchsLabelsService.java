/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.DispatchsLabels;
import com.naissant.naissantapp.message.ProyectsFile;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface DispatchsLabelsService {
    List<DispatchsLabels>listar();
    DispatchsLabels listarId(int id);
    DispatchsLabels add(DispatchsLabels d);
    DispatchsLabels edit(DispatchsLabels d);
    DispatchsLabels delete(int id);
    
    List<DispatchsLabels>listarByIdDispatch(int id_dispatch);
    List<DispatchsLabels>listarByIdInvoice(int id_invoice);
    List<DispatchsLabels>listarByIdCarrier(int id_carrier);
    List<DispatchsLabels>listarByIdCarrierAcc(int id_carrier_acc);
    List<DispatchsLabels>listarByIdOrigin(int id_origin);
    List<DispatchsLabels>listarByIdDestination(int id_Destination);

    public ProyectsFile savePhotoLabel(Integer labelId, MultipartFile[] files, String description) throws IOException;
    public Resource downloadLabelPicture(Integer labelId);
}
