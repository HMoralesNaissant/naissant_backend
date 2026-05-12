/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Disabilities;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface DisabilitiesService {
    List<Disabilities>listar();
    Disabilities listarId(int id);
    Disabilities add(Disabilities d);
    Disabilities edit(Disabilities d);
    Disabilities delete(int id);
    
    List<Disabilities>listarByIdEmployee(int id_employee);
    
    public ProyectsFile saveSupport(Integer disabilityId, MultipartFile[] files, String description) throws IOException;
    public List<GenFiles> listarByNameFile(String name_file);
    public Resource downloadSupport(Integer disabilityId);
}
