/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Customers;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer>{

    @Override
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    List<Customers> findAll();

    @Override
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    Optional<Customers> findById(Integer id);

    
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    List<Customers>findByPersonId_Id(int id_person);
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    List<Customers>findByZoneId_Id(int id_zone);
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    List<Customers>findByAdvisorId_Id(int id_advisor);
    @EntityGraph(attributePaths = {"personId", "cityBranchId"})
    List<Customers>findByCompanyCode(String company_code);
}
