/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.ConsecutivosPrefijos;

import java.util.List;


public interface ConsecutivosPrefijosService {
    List<ConsecutivosPrefijos>listar();
    ConsecutivosPrefijos listarId(int id);
    ConsecutivosPrefijos add(ConsecutivosPrefijos c);
    ConsecutivosPrefijos edit(ConsecutivosPrefijos c);
    ConsecutivosPrefijos delete(int id);
    
    List<ConsecutivosPrefijos>listarByIdSucursal(int id_sucursal);
    List<ConsecutivosPrefijos>listarByIdArea(int id_area);
}
