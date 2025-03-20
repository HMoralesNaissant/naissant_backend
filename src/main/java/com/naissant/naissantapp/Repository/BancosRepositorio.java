/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Bancos;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface BancosRepositorio extends Repository<Bancos, Integer>{
    List<Bancos>findAll();
    Bancos findById(int id);
    Bancos save(Bancos b);
    void delete(Bancos b);
    
    List<Bancos>findByEmpresaId_Id(int id_empresa);
}
