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
    @Column
    private String code_dian;
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
