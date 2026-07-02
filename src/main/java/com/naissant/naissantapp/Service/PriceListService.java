/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PriceList;
import java.util.List;


public interface PriceListService {
    List<PriceList>listar();
    PriceList listarId(int id);
    PriceList add(PriceList p);
    PriceList edit(PriceList p);
    PriceList delete(int id);
    
    List<PriceList>listarByIdCompany(int id_company);
}
