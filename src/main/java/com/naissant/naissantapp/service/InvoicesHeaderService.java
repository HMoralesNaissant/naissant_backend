/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.InvoicesHeader;
import java.util.List;


public interface InvoicesHeaderService {
    List<InvoicesHeader>listar();
    InvoicesHeader listarId(int id);
    InvoicesHeader add(InvoicesHeader i);
    InvoicesHeader edit(InvoicesHeader i);
    InvoicesHeader delete(int id);
    
    List<InvoicesHeader>listarByIdCompany(int id_company);
    List<InvoicesHeader>listarByStatus(char status);
    List<InvoicesHeader>listarByInvoice(Double invoice);
}
