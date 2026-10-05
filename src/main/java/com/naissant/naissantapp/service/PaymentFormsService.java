/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.PaymentForms;
import java.util.List;

public interface PaymentFormsService {
    
    List<PaymentForms>listar();
    PaymentForms listarId(int id);
    PaymentForms add(PaymentForms f);
    PaymentForms edit(PaymentForms f);
    PaymentForms delete(int id);
    
    List<PaymentForms>listarByIdCompany(int id_company);
}
