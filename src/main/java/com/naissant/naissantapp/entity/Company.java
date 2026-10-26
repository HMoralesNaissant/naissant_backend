/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "conf_company")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Company implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
    @Column
    private String description;
    @Column
    private String nit;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String phone;
    @Column
    private String cellular;
    @Column
    private String website;
    @Column(name = "legal_representative")
    @JsonProperty("legal_representative")
    private String legalRepresentative;
    @Column
    private String email;
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
