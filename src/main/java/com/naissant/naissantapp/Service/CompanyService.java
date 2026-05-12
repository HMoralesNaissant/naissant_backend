/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Company;
import com.naissant.naissantapp.Entity.GenFiles;
import java.util.List;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface CompanyService {
    List<Company>listar();
    Company listarId(int id);
    Company add(Company c);
    Company edit(Company c);
    Company delete(int id);
    
    public ProyectsFile savePhotoProfile(Integer companyId, MultipartFile[] files, String description) throws IOException;
    public List<GenFiles> listarByNameFile(String name_file);
    public Resource downloadProfilePicture(Integer companyId);
}
