/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

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
public class Consecutives {
    
    
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
    @Column
    private double start_num;
    @Column
    private double end_num;
    @Column
    private double current_cons;
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
