/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_evaluacion_investigadores")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvaluacionInvestigadores {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresaId;
    @Column
    private String tipo_evaluante;
    @Column
    private String calificacion;
    @Column
    private Double rango_min;
    @Column
    private Double rango_max;
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

    public Empresa getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresa empresaId) {
        this.empresaId = empresaId;
    }

    public String getTipo_evaluante() {
        return tipo_evaluante;
    }

    public void setTipo_evaluante(String tipo_evaluante) {
        this.tipo_evaluante = tipo_evaluante;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Double getRango_min() {
        return rango_min;
    }

    public void setRango_min(Double rango_min) {
        this.rango_min = rango_min;
    }

    public Double getRango_max() {
        return rango_max;
    }

    public void setRango_max(Double rango_max) {
        this.rango_max = rango_max;
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
