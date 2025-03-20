/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Empresa;
import com.naissant.naissantapp.Entity.GenArchivos;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface EmpresaService {
    List<Empresa>listar();
    Empresa listarId(int id);
    Empresa add(Empresa e);
    Empresa edit(Empresa e);
    Empresa delete(int id);
    
    public ProyectosFile saveFotoPerfil(Integer empresaId, MultipartFile[] files, String descripcion) throws IOException;
    public List<GenArchivos> listarByNombreArchivo(String nombre_archivo);
    public Resource downloadProfilePicture(Integer empresaId);
}
