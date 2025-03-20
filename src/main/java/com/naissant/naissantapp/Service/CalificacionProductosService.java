/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.CalificacionProductos;
import java.util.List;
import org.springframework.core.io.Resource;


public interface CalificacionProductosService {

     List<CalificacionProductos>listar();
    CalificacionProductos listarId(int id);
    CalificacionProductos add(CalificacionProductos c);
    CalificacionProductos edit(CalificacionProductos c);
    CalificacionProductos delete(int id);
    
    List<CalificacionProductos>listarByIdEvidencia(int id_evidencia);
    public Resource downloadFile(Integer archivoId);
}
