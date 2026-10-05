/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.SeveranceFund;
import java.util.List;


public interface SeveranceFundService {
    List<SeveranceFund>listar();
    SeveranceFund listarId(int id);
    SeveranceFund add(SeveranceFund s);
    SeveranceFund edit(SeveranceFund s);
    SeveranceFund delete(int id);
    
    List<SeveranceFund>listarByIdCompany(int id_company);
}
