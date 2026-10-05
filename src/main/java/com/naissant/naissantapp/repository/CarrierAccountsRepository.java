/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.CarrierAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;

@org.springframework.stereotype.Repository
public interface CarrierAccountsRepository extends JpaRepository<CarrierAccounts, Integer>{

    @Override
    @EntityGraph(attributePaths = {"carrierId"})
    List<CarrierAccounts> findAll();

    @Override
    @EntityGraph(attributePaths = {"carrierId"})
    Optional<CarrierAccounts> findById(Integer id);

    
    @EntityGraph(attributePaths = {"carrierId"})
    List<CarrierAccounts>findByCarrierId_Id(int id_carrier);
}
