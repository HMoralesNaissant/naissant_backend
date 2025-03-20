/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ClasificacionProductos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ClasificacionProductosRepositorio extends JpaRepository<ClasificacionProductos, Integer>{
    
    List<ClasificacionProductos>findByTipoprodId_Id(int id_tipoprod);
    List<ClasificacionProductos>findByProductoId_Id(int id_producto);
}
