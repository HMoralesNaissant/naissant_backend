/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.service;

import com.naissant.naissantapp.entity.PortfolioAge;
import java.util.List;


public interface PortfolioAgeService {
    List<PortfolioAge>listar();
    PortfolioAge listarId(int id);
    PortfolioAge add(PortfolioAge p);
    PortfolioAge edit(PortfolioAge p);
    PortfolioAge delete(int id);
    
    List<PortfolioAge>listarByIdCompany(int id_company);
}
