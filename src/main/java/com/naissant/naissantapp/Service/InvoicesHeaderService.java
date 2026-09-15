/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.InvoicesHeader;
import java.util.List;


public interface InvoicesHeaderService {
    List<InvoicesHeader>listar();
    InvoicesHeader listarId(int id);
    InvoicesHeader add(InvoicesHeader i);
    InvoicesHeader edit(InvoicesHeader i);
    InvoicesHeader delete(int id);
    
    List<InvoicesHeader>listarByIdCompany(int id_company);
}
