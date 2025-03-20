/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Evidencias;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface EvidenciasService {
    List<Evidencias>listar();
    Evidencias listarId(int id);
    Evidencias add(Evidencias e);
    Evidencias edit(Evidencias e);
    Evidencias delete(int id);
    
    List<Evidencias>listarByIdProyecto(int id_proyecto);
    List<Evidencias> listarByIdGrupoInvestigacion(int id_grupo_investigacion);
    
    public ProyectosFile saveArchivo(Integer evidenciaId, MultipartFile[] files, String descripcion) throws IOException;
    public Resource downloadFile(Integer evidenciaId);
}
