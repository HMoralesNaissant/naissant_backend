/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "gen_citys")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Citys {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @JoinColumn(name = "id_dpts", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Departments getDptsId() {
        return dptsId;
    }

    public void setDptsId(Departments dptsId) {
        this.dptsId = dptsId;
    }

    public int getIndicative() {
        return indicative;
    }

    public void setIndicative(int indicative) {
        this.indicative = indicative;
    }

    public String getCod_dane() {
        return cod_dane;
    }

    public void setCod_dane(String cod_dane) {
        this.cod_dane = cod_dane;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getUser_update() {
        return user_update;
    }

    public void setUser_update(String user_update) {
        this.user_update = user_update;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }
    
}
