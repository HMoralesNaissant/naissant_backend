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
    @Column
    private String type_identification;
    @JoinColumn(name = "id_city_exp", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys cityExpId;
    @Column
    private Date date_birth;
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
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }  
}