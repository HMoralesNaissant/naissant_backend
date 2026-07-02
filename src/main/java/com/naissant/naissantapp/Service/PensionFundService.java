/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.PensionFund;
import java.util.List;


public interface PensionFundService {
    List<PensionFund>listar();
    PensionFund listarId(int id);
    PensionFund add(PensionFund p);
    PensionFund edit(PensionFund p);
    PensionFund delete(int id);
    
    List<PensionFund>listarByIdCompany(int id_company);
}
