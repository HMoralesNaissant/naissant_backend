/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Taxes;
import java.util.List;


public interface TaxesService {
    List<Taxes>listar();
    Taxes listarId(int id);
    Taxes add(Taxes t);
    Taxes edit(Taxes t);
    Taxes delete(int id);
    
    List<Taxes>listarByIdCompany(int id_company);
}
