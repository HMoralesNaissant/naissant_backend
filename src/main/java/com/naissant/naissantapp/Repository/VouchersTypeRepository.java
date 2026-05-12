/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.VouchersType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface VouchersTypeRepository extends JpaRepository<VouchersType, Integer>{
    
    List<VouchersType>findByCompanyId_Id(int id_company);
}
