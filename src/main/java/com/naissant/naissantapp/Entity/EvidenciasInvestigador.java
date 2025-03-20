/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_evidencias_inv")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvidenciasInvestigador {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_evidencia", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Evidencias evidenciaId;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Investigadores investigadorId;
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

    public Evidencias getEvidenciaId() {
        return evidenciaId;
    }

    public void setEvidenciaId(Evidencias evidenciaId) {
        this.evidenciaId = evidenciaId;
    }

    public Investigadores getInvestigadorId() {
        return investigadorId;
    }

    public void setInvestigadorId(Investigadores investigadorId) {
        this.investigadorId = investigadorId;
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
