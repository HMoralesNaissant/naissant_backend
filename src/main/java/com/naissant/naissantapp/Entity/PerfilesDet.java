/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "conf_perfiles_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PerfilesDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_perfiles", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Perfiles perfilesId;
    @JoinColumn(name = "id_opciones", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Opciones opcionesId;
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

    public Perfiles getPerfilesId() {
        return perfilesId;
    }

    public void setPerfilesId(Perfiles perfilesId) {
        this.perfilesId = perfilesId;
    }
    
    public Opciones getOpcionesId() {
        return opcionesId;
    }

    public void setOpcionesId(Opciones opcionesId) {
        this.opcionesId = opcionesId;
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
    
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
