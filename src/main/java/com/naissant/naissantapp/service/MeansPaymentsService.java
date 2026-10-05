/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.MeansPayments;
import java.util.List;

public interface MeansPaymentsService {

    List<MeansPayments>listar();
    MeansPayments listarId(int id);
    MeansPayments add(MeansPayments m);
    MeansPayments edit(MeansPayments m);
    MeansPayments delete(int id);
    
    List<MeansPayments>listarByIdCompany(int id_company);
}
