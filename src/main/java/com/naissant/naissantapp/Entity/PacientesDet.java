/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "codo_pacientes_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PacientesDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pacientes pacienteId;
    @JoinColumn(name = "id_estudiante_autorizado", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudiantesClinicaOdo estudianteAutorizadoId;
    @JoinColumn(name = "id_concepto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Conceptos conceptoId;
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

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
    }

    public EstudiantesClinicaOdo getEstudianteAutorizadoId() {
        return estudianteAutorizadoId;
    }

    public void setEstudianteAutorizadoId(EstudiantesClinicaOdo estudianteAutorizadoId) {
        this.estudianteAutorizadoId = estudianteAutorizadoId;
    }

    public Conceptos getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(Conceptos conceptoId) {
        this.conceptoId = conceptoId;
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
