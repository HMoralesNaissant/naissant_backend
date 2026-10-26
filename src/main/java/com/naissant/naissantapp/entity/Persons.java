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
@Table(name = "conf_persons")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Persons implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private String name;
    @Column
    private String surnames;
    @Column
    private Double identification;
    @Column(name = "type_identification")
    @JsonProperty("type_identification")
    private String typeIdentification;
    @JoinColumn(name = "id_city_exp", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys cityExpId;
    @Column(name = "date_birth")
    @JsonProperty("date_birth")
    private Date dateBirth;
    @Column
    private String phone;
    @Column
    private String cellular;
    @Column
    private String address;
    @JoinColumn(name = "id_departments", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departments departmentsId;
    @JoinColumn(name = "id_city", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys cityId;
    @Column
    private String email;
    @Column
    private char sex;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }  
}