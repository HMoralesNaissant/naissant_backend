/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.SalesChannels;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface SalesChannelsRepository extends JpaRepository<SalesChannels, Integer>{

    @Override
    @EntityGraph(attributePaths = {"listId"})
    List<SalesChannels> findAll();

    @Override
    @EntityGraph(attributePaths = {"listId"})
    Optional<SalesChannels> findById(Integer id);

    
    @EntityGraph(attributePaths = {"listId"})
    List<SalesChannels>findByListId_Id(int id_list);
    @EntityGraph(attributePaths = {"listId"})
    List<SalesChannels>findByCompanyId_Id(int id_company);
}
