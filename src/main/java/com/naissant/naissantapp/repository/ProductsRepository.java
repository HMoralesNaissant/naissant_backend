/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.Products;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{

    @Override
    @EntityGraph(attributePaths = {"catProductsId", "undMeasuresId", "presentationId"})
    List<Products> findAll();

    @Override
    @EntityGraph(attributePaths = {"catProductsId", "undMeasuresId", "presentationId"})
    Optional<Products> findById(Integer id);

    
    @EntityGraph(attributePaths = {"catProductsId", "undMeasuresId", "presentationId"})
    List<Products>findByCatProductsId_Id(int id_cat_products);
    @EntityGraph(attributePaths = {"catProductsId", "undMeasuresId", "presentationId"})
    List<Products>findByPresentationId_Id(int id_presentation);
    /*List<Products>findByBarCode(String bar_code);*/
}
