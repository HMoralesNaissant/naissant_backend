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
@Table(name = "conf_economic_activity")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class EconomicActivity implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column(name = "code_dian")
    @JsonProperty("code_dian")
    private String codeDian;
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
