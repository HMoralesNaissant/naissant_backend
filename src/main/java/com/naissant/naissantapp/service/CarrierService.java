/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.Carrier;
import com.naissant.naissantapp.message.ProyectsFile;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface CarrierService {
    List<Carrier>listar();
    Carrier listarId(int id);
    Carrier add(Carrier c);
    Carrier edit(Carrier c);
    Carrier delete(int id);
    
    List<Carrier>listarByIdCompany(int id_company);

    public ProyectsFile savePhotoProfile(Integer carrierId, MultipartFile[] files, String description) throws IOException;
    public Resource downloadProfilePicture(Integer carrierId);
}
