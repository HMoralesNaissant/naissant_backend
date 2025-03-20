/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_proyectos_inv")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProyectosInvestigador {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Proyectos proyectoId;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Investigadores investigadorId;
    @JoinColumn(name = "id_cargo", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private CargosInvestigadores cargoId;
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

    public Proyectos getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Proyectos proyectoId) {
        this.proyectoId = proyectoId;
    }
    
    public Investigadores getInvestigadorId() {
        return investigadorId;
    }

    public void setInvestigadorId(Investigadores investigadorId) {
        this.investigadorId = investigadorId;
    }

    public CargosInvestigadores getCargoId() {
        return cargoId;
    }

    public void setCargoId(CargosInvestigadores cargoId) {
        this.cargoId = cargoId;
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
