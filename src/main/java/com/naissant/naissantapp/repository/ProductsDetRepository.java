/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.ProductsDet;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductsDetRepository extends JpaRepository<ProductsDet, Integer>{

    @Override
    @EntityGraph(attributePaths = {"productsContId", "productsContId.undMeasuresId", "productsContId.presentationId"})
    List<ProductsDet> findAll();

    @Override
    @EntityGraph(attributePaths = {"productsContId", "productsContId.undMeasuresId", "productsContId.presentationId"})
    Optional<ProductsDet> findById(Integer id);

    
    @EntityGraph(attributePaths = {"productsContId", "productsContId.undMeasuresId", "productsContId.presentationId"})
    List<ProductsDet>findByProductsId_Id(int id_products);
}
