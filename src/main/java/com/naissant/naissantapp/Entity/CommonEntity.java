/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
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
