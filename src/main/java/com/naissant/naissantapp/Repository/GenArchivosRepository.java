/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;


import com.naissant.naissantapp.Entity.GenArchivos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenArchivosRepository extends JpaRepository<GenArchivos, Integer>{

    List<GenArchivos>findByNombreArchivo(String nombre_archivo);
}
