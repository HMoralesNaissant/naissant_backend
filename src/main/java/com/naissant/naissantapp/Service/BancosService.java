/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Bancos;

import java.util.List;


public interface BancosService {
    List<Bancos>listar();
    Bancos listarId(int id);
    Bancos add(Bancos b);
    Bancos edit(Bancos b);
    Bancos delete(int id);
    
    List<Bancos>listarByIdEmpresa(int id_empresa);
}