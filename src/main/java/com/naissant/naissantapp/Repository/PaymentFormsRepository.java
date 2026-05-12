/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PaymentForms;
import org.springframework.data.repository.Repository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface PaymentFormsRepository extends Repository<PaymentForms, Integer>{
    
    List<PaymentForms>findAll();
    PaymentForms findById(int id);
    PaymentForms save(PaymentForms f);
    void delete(PaymentForms f);
    
    List<PaymentForms>findByCompanyId_Id(int id_company);
}
