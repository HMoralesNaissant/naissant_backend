/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Permits;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface PermitsService {
    List<Permits>listar();
    Permits listarId(int id);
    Permits add(Permits p);
    Permits edit(Permits p);
    Permits delete(int id);
    
    List<Permits>listarByIdEmployee(int id_employee);
    
    public ProyectsFile saveSupport(Integer permitId, MultipartFile[] files, String description) throws IOException;
    public List<GenFiles> listarByNameFile(String name_file);
    public Resource downloadSupport(Integer permitId);
}
