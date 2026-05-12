/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.PortfolioAge;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PortfolioAgeRepository extends JpaRepository<PortfolioAge, Integer>{
    
    List<PortfolioAge>findByCompanyId_Id(int id_company);
}
