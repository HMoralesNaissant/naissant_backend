/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProyectosAprobadosObs;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;


public interface ProyectosAprobadosObsService {
    List<ProyectosAprobadosObs>listar();
    ProyectosAprobadosObs listarId(int id);
    ProyectosAprobadosObs add(ProyectosAprobadosObs p);
    ProyectosAprobadosObs edit(ProyectosAprobadosObs p);
    ProyectosAprobadosObs delete(int id);
    
    List<ProyectosAprobadosObs>listarByIdProyectoAprob(int id_proyecto_aprob);
    
    public ProyectosFile saveArchivo(Integer proyectosaprobId, MultipartFile[] files, String descripcion) throws IOException;
}
