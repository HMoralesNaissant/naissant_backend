/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.MeansPayments;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface MeansPaymentsRepository extends Repository<MeansPayments, Integer>{

    List<MeansPayments>findAll();
    MeansPayments findById(int id);
    MeansPayments save(MeansPayments m);
    void delete(MeansPayments m);
    
    List<MeansPayments>findByCompanyId_Id(int id_company);
}
