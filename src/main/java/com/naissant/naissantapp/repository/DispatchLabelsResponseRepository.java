package com.naissant.naissantapp.repository;

import com.naissant.naissantapp.entity.DispatchLabelsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchLabelsResponseRepository extends JpaRepository<DispatchLabelsResponse, Integer> {
}
