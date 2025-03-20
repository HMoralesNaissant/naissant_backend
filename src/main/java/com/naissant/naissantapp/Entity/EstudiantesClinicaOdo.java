/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "codo_estudiantes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstudiantesClinicaOdo {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Personas personaId;
    @JoinColumn(name = "id_ano_semestre", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private AnoSemestre anoSemestreId;
    @JoinColumn(name = "id_tipoprograma", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProgramas tipoprogramaId;
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProgAcademicos programaId;
    @Column
    private String email_inst;
    @Column
    private int semestre;
    @Column
    private String estado_matricula;
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

    public AnoSemestre getAnoSemestreId() {
        return anoSemestreId;
    }

    public void setAnoSemestreId(AnoSemestre anoSemestreId) {
        this.anoSemestreId = anoSemestreId;
    }

    public TipoProgramas getTipoprogramaId() {
        return tipoprogramaId;
    }

    public void setTipoprogramaId(TipoProgramas tipoprogramaId) {
        this.tipoprogramaId = tipoprogramaId;
    }

    public ProgAcademicos getProgramaId() {
        return programaId;
    }

    public void setProgramaId(ProgAcademicos programaId) {
        this.programaId = programaId;
    }

    public String getEmail_inst() {
        return email_inst;
    }

    public void setEmail_inst(String email_inst) {
        this.email_inst = email_inst;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
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
