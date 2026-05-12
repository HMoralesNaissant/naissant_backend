/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.VouchersType;
import java.util.List;


public interface VouchersTypeService {
    List<VouchersType>listar();
    VouchersType listarId(int id);
    VouchersType add(VouchersType v);
    VouchersType edit(VouchersType v);
    VouchersType delete(int id);
    
    List<VouchersType>listarByIdCompany(int id_company);
}
