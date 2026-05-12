/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Banks;

import java.util.List;


public interface BanksService {
    
    List<Banks>listar();
    Banks listarId(int id);
    Banks add(Banks b);
    Banks edit(Banks b);
    Banks delete(int id);
    
    List<Banks>listarByIdCompany(int id_company);
}