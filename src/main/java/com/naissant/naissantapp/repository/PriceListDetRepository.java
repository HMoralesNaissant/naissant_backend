/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.PriceListDet;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PriceListDetRepository extends JpaRepository<PriceListDet, Integer>{

    @Override
    @EntityGraph(attributePaths = {"productId"})
    List<PriceListDet> findAll();

    @Override
    @EntityGraph(attributePaths = {"productId"})
    Optional<PriceListDet> findById(Integer id);

    
    @EntityGraph(attributePaths = {"productId"})
    List<PriceListDet>findByListId_Id(int id_list);
    @EntityGraph(attributePaths = {"productId"})
    List<PriceListDet>findByCatproductsId_Id(int id_catproducts);
    @EntityGraph(attributePaths = {"productId"})
    List<PriceListDet>findByProductId_Id(int id_product);
}
