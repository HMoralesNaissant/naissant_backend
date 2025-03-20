/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "codo_pacientes_enc")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pacientes {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Personas personaId;
    @Column
    private Double historia_clinica;
    @Column
    private String acudiente;
    @Column
    private String parentesco;
    @Column
    private String direccion_acudiente;
    @Column
    private Double telefono_acudiente;
    @JoinColumn(name = "id_estudiante_inscribe", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudiantesClinicaOdo estudianteInscribeId;
    @Column
    private int semestre;
    @Column
    private Date fecha_inscripcion;
    @Column
    private String observaciones;
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

    public Personas getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Personas personaId) {
        this.personaId = personaId;
    }

    public Double getHistoria_clinica() {
        return historia_clinica;
    }

    public void setHistoria_clinica(Double historia_clinica) {
        this.historia_clinica = historia_clinica;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getDireccion_acudiente() {
        return direccion_acudiente;
    }

    public void setDireccion_acudiente(String direccion_acudiente) {
        this.direccion_acudiente = direccion_acudiente;
    }

    public Double getTelefono_acudiente() {
        return telefono_acudiente;
    }

    public void setTelefono_acudiente(Double telefono_acudiente) {
        this.telefono_acudiente = telefono_acudiente;
    }

    public EstudiantesClinicaOdo getEstudianteInscribeId() {
        return estudianteInscribeId;
    }

    public void setEstudianteInscribeId(EstudiantesClinicaOdo estudianteInscribeId) {
        this.estudianteInscribeId = estudianteInscribeId;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
