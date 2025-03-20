/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Proyectos;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ProyectosService {
    List<Proyectos> listar();
    Proyectos listarId(int id);
    Proyectos add(Proyectos p);
    Proyectos edit(Proyectos p);
    Proyectos delete(int id);

    List<Proyectos> listarByIdEmpresa(int id_empresa);
    List<Proyectos> listarByIdGrupoInvestigacion(int id_grupo_investigacion);
    
    public ProyectosFile saveArchivo(Integer proyectoId, MultipartFile[] files, String descripcion) throws IOException;
    public Resource downloadFile(Integer proyectoId);
}
