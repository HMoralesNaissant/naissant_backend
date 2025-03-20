/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_investigadores_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvestigadoresDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Investigadores investigadorId;
    @JoinColumn(name = "id_grupo", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private GruposInvestigacion grupoId;
    @Column
    private Date fecha_ingreso;
    @Column
    private Date fecha_retiro;
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

    public Investigadores getInvestigadorId() {
        return investigadorId;
    }

    public void setInvestigadorId(Investigadores investigadorId) {
        this.investigadorId = investigadorId;
    }

    public GruposInvestigacion getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(GruposInvestigacion grupoId) {
        this.grupoId = grupoId;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(Date fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
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
