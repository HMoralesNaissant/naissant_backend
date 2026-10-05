/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.InvoicesDetail;
import java.util.List;

public interface InvoicesDetailService {
    List<InvoicesDetail>listar();
    InvoicesDetail listarId(int id);
    InvoicesDetail add(InvoicesDetail i);
    InvoicesDetail edit(InvoicesDetail i);
    InvoicesDetail delete(int id);
    
    List<InvoicesDetail>listarByIdInvoice(int id_invoice);
}
