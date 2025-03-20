/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Procedimientos;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface ProcedimientosRepositorio extends Repository<Procedimientos, Integer>{
    List<Procedimientos>findAll();
    Procedimientos findById(int id);
    Procedimientos save(Procedimientos p);
    void delete(Procedimientos p);
    
    List<Procedimientos>findByConceptoId_Id(int id_concepto);
}
