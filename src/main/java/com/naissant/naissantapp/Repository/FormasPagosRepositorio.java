/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.FormasPagos;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface FormasPagosRepositorio extends Repository<FormasPagos, Integer>{
    List<FormasPagos>findAll();
    FormasPagos findById(int id);
    FormasPagos save(FormasPagos f);
    void delete(FormasPagos f);
    
    List<FormasPagos>findByEmpresaId_Id(int id_empresa);
}
