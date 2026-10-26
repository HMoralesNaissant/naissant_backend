/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @Column(name = "cod_dane")
    @JsonProperty("cod_dane")
    private String codDane;
    @Column
    private char status;
    @Column(name = "user_create")
    @JsonProperty("user_create")
    private String userCreate;
    @Column(name = "date_create")
    @JsonProperty("date_create")
    private Date dateCreate;
    @Column(name = "user_update")
    @JsonProperty("user_update")
    private String userUpdate;
    @Column(name = "date_update")
    @JsonProperty("date_update")
    private Date dateUpdate;

    
}
