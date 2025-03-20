/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ProyectosAprobados;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface ProyectosAprobadosService {
    List<ProyectosAprobados>listar();
    ProyectosAprobados listarId(int id);
    ProyectosAprobados add(ProyectosAprobados p);
    ProyectosAprobados edit(ProyectosAprobados p);
    ProyectosAprobados delete(int id);
    
    List<ProyectosAprobados>listarByIdProyecto(int id_proyecto);
    List<ProyectosAprobados>listarByVbBioetico(char vb_bioetico);
    List<ProyectosAprobados>listarByVbCientifico(char vb_cientifico);
    List<ProyectosAprobados>listarByAcuerdoCientifico(char acuerdo_cientifico);
    
    public ProyectosFile saveArchivo(Integer proyectosaprobId, MultipartFile[] files, String descripcion) throws IOException;
    public ProyectosFile saveArchivoAcuerdo(Integer proyectosaprobId, MultipartFile[] files, String descripcion) throws IOException;
    public ProyectosFile saveArchivoBioetica(Integer proyectosaprobId, MultipartFile[] files, String descripcion) throws IOException;
    public Resource downloadFile(Integer proyectosaprobId, String descripcion);
}
