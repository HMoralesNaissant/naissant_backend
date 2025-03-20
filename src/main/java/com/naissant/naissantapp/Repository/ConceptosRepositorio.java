/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Conceptos;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface ConceptosRepositorio extends Repository<Conceptos, Integer>{
    List<Conceptos>findAll();
    Conceptos findById(int id);
    Conceptos save(Conceptos c);
    void delete(Conceptos c);
    
    List<Conceptos>findByEmpresaId_Id(int id_empresa);
}
