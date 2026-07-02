/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/
package com.naissant.naissantapp.Entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonEntity {
    
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
