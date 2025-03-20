/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Digitalizacion;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface DigitalizacionService {
    List<Digitalizacion>listar();
    Digitalizacion listarId(int id);
    Digitalizacion add(Digitalizacion d);
    Digitalizacion edit(Digitalizacion d);
    Digitalizacion delete(int id);
    
    List<Digitalizacion>listarByIdEstudiante(int id_estudiante);
    
    public ProyectosFile saveArchivo(Integer digitalizacionId, MultipartFile[] files, String descripcion, String estudianteId) throws IOException;
    public Resource downloadFile(Integer evidenciaId);
}