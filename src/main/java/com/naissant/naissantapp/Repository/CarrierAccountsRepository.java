/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.CarrierAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CarrierAccountsRepository extends JpaRepository<CarrierAccounts, Integer>{
    
    List<CarrierAccounts>findByCarrierId_Id(int id_carrier);
}
