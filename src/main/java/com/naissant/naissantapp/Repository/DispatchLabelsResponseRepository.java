package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.DispatchLabelsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchLabelsResponseRepository extends JpaRepository<DispatchLabelsResponse, Integer> {
}
