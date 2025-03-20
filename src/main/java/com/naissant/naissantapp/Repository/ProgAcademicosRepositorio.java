/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.ProgAcademicos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProgAcademicosRepositorio extends JpaRepository<ProgAcademicos, Integer>{
    
    List<ProgAcademicos>findByTipoprogramaId_Id(int id_tipoprograma);
}
