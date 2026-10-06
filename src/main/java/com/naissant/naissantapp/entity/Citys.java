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
@Table(name = "gen_citys")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Citys implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @JoinColumn(name = "id_dpts", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departments dptsId;
    @Column
    private int indicative;
    @Column
    private String cod_dane;
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
