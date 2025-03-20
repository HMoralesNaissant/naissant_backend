/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.AnoSemestre;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AnoSemestreRepositorio extends JpaRepository<AnoSemestre, Integer>{
    
    List<AnoSemestre>findByEmpresaId_Id(int id_empresa);
}
