/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;


import com.naissant.naissantapp.entity.GenFiles;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenFilesRepository extends JpaRepository<GenFiles, Integer>{

    List<GenFiles>findByNameFile(String name_file);
}
