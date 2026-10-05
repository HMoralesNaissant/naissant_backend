/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/
package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class CommonEntity {
    
    private String estado;
    
    
    
}
