/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Visitantes;
import com.naissant.naissantapp.Entity.GenFiles;
import java.util.List;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface VisitantesService {
    List<Visitantes>listar();
    Visitantes listarId(int id);
    Visitantes add(Visitantes v);
    Visitantes edit(Visitantes v);
    Visitantes delete(int id);
    
    List<Visitantes>listarByIdPersona(int id_persona);
    public ProyectsFile saveFotoVisita(Integer visitantesId, MultipartFile[] files, String descripcion) throws IOException;
    public List<GenFiles> listarByNombreArchivo(String nombre_archivo);
    public Resource downloadPictureVisit(Integer visitantesId);
}
