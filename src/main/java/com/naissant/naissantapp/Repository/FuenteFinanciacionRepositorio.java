/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.FuenteFinanciacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface FuenteFinanciacionRepositorio extends JpaRepository<FuenteFinanciacion, Integer>{
    
    List<FuenteFinanciacion>findByEmpresaId_Id(int id_empresa);
}
