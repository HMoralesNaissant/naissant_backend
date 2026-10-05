/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.sql.Blob;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "gen_departments")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Departments {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @JoinColumn(name = "id_country", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Country countryId;
    @Column
    private String dpts_code;
    @Column
    private char status;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;
    
}
