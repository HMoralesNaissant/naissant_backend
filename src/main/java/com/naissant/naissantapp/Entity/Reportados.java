
/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "port_reportados")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Reportados {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Persons personaId;
    @Column
    private Date fecha_reporte;
    @Column
    private String motivo_reporte;
    @Column
    private String observaciones_rep;
    @Column
    private char habilitado;
    @Column
    private String observaciones_hab;
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

    public Persons getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persons personaId) {
        this.personaId = personaId;
    }

    public Date getFecha_reporte() {
        return fecha_reporte;
    }

    public void setFecha_reporte(Date fecha_reporte) {
        this.fecha_reporte = fecha_reporte;
    }

    public String getMotivo_reporte() {
        return motivo_reporte;
    }

    public void setMotivo_reporte(String motivo_reporte) {
        this.motivo_reporte = motivo_reporte;
    }

    public String getObservaciones_rep() {
        return observaciones_rep;
    }

    public void setObservaciones_rep(String observaciones_rep) {
        this.observaciones_rep = observaciones_rep;
    }

    public char getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(char habilitado) {
        this.habilitado = habilitado;
    }

    public String getObservaciones_hab() {
        return observaciones_hab;
    }

    public void setObservaciones_hab(String observaciones_hab) {
        this.observaciones_hab = observaciones_hab;
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
