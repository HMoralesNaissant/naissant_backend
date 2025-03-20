/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ClasificacionProductos;
import java.util.List;


public interface ClasificacionProductosService {
    List<ClasificacionProductos>listar();
    ClasificacionProductos listarId(int id);
    ClasificacionProductos add(ClasificacionProductos c);
    ClasificacionProductos edit(ClasificacionProductos c);
    ClasificacionProductos delete(int id);
    
    List<ClasificacionProductos>listarByIdTipoprod(int id_tipoprod);
    List<ClasificacionProductos>listarByIdProducto(int id_producto);
}
