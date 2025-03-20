/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "adm_estudiantes")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Estudiantes {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Personas personaId;
    @Column
    private String salutem;
    @JoinColumn(name = "id_tipoprograma", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProgramas tipoprogramaId;
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProgAcademicos programaId;
    @Column
    private String email_inst;
    @Column
    private String estado_matricula;
    @Column
    private char retiro;
    @Column
    private Date fecha_inicio;
    @Column
    private Date fecha_finalizacion;
    @Column
    private Double identificacion;
    @Column
    private String tipo_identificacion;
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

    public String getSalutem() {
        return salutem;
    }

    public void setSalutem(String salutem) {
        this.salutem = salutem;
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
    
    public String getEstado_matricula() {
        return estado_matricula;
    }

    public void setEstado_matricula(String estado_matricula) {
        this.estado_matricula = estado_matricula;
    }
    
    public String getEmail_inst() {
        return email_inst;
    }

    public void setEmail_inst(String email_inst) {
        this.email_inst = email_inst;
    }

    public char getRetiro() {
        return retiro;
    }

    public void setRetiro(char retiro) {
        this.retiro = retiro;
    }
    
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public Double getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Double identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
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
