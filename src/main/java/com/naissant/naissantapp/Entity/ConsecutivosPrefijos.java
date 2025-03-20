/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gen_consecutivos_prefijos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsecutivosPrefijos {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sucursal sucursalId;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Areas areaId;
    @Column
    private String tipo_doc;
    @Column
    private String prefijo;
    @Column
    private double inicio_num;
    @Column
    private double actual_cons;
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

    public Sucursal getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Sucursal sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Areas getAreaId() {
        return areaId;
    }

    public void setAreaId(Areas areaId) {
        this.areaId = areaId;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public double getInicio_num() {
        return inicio_num;
    }

    public void setInicio_num(double inicio_num) {
        this.inicio_num = inicio_num;
    }

    public double getActual_cons() {
        return actual_cons;
    }

    public void setActual_cons(double actual_cons) {
        this.actual_cons = actual_cons;
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
