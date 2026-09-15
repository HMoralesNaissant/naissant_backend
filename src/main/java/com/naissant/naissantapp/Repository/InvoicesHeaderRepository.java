/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.InvoicesHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@org.springframework.stereotype.Repository
public interface InvoicesHeaderRepository extends JpaRepository<InvoicesHeader, Integer>{
    
    List<InvoicesHeader>findByCompanyId_Id(int id_company);
}
