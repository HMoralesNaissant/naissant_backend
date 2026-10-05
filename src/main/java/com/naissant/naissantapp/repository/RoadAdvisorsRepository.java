/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.RoadAdvisors;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface RoadAdvisorsRepository extends JpaRepository<RoadAdvisors, Integer>{

    @Override
    @EntityGraph(attributePaths = {"customerId", "advisorId", "advisorId.employeeId", "advisorId.employeeId.personId"})
    List<RoadAdvisors> findAll();

    @Override
    @EntityGraph(attributePaths = {"customerId", "advisorId", "advisorId.employeeId", "advisorId.employeeId.personId"})
    Optional<RoadAdvisors> findById(Integer id);

    
    @EntityGraph(attributePaths = {"customerId", "advisorId", "advisorId.employeeId", "advisorId.employeeId.personId"})
    List<RoadAdvisors>findByAdvisorId_Id(int id_advisor);
    @EntityGraph(attributePaths = {"customerId", "advisorId", "advisorId.employeeId", "advisorId.employeeId.personId"})
    List<RoadAdvisors>findByCustomerId_Id(int id_customer);
    //List<RoadAdvisors>findByDateVisit(Date dateVisit);
}
