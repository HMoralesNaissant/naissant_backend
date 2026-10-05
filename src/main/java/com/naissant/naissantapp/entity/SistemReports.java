/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "sistem_reports")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class SistemReports extends CommonEntity{
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String codigo;
    @Column
    private String titulo;
    @Column
    private String ubicacion;
    @Column
    private String reporte;
    
}
