/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gen_consecutives")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Consecutives implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @JoinColumn(name = "id_voucherstype", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VouchersType voucherstypeId;
    @Column
    private String prefix;
    @Column(name = "start_num")
    @JsonProperty("start_num")
    private double startNum;
    @Column(name = "end_num")
    @JsonProperty("end_num")
    private double endNum;
    @Column(name = "current_cons")
    @JsonProperty("current_cons")
    private double currentCons;
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
