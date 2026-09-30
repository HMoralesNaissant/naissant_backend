/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.DispatchsControl;
import com.naissant.naissantapp.message.ProyectsFile;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface DispatchsControlService {
    List<DispatchsControl>listar();
    DispatchsControl listarId(int id);
    DispatchsControl add(DispatchsControl d);
    DispatchsControl edit(DispatchsControl d);
    DispatchsControl delete(int id);
    
    List<DispatchsControl>listarByIdInvoice(int id_invoice);
    List<DispatchsControl>listarByVerified(char verified);
    List<DispatchsControl>listarByDispatched(char dispatched);

    public ProyectsFile savePhotoProfile(Integer dispatchId, MultipartFile[] files, String description) throws IOException;
    public Resource downloadProfilePicture(Integer dispatchId);
}
