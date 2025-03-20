/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "conf_prog_academicos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgAcademicos {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresaId;
    @Column
    private String nombre;
    @Column
    private String codigoSNIES;
    @Column
    private String registro_calificado;
    @JoinColumn(name = "id_tipoprograma", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProgramas tipoprogramaId;
    @Column
    private int num_semestres;
    @Column
    private String form_academica;
    @Column
    private String modalidad;
    @Column
    private String jornada;
    @Column
    private String email;
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
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoSNIES() {
        return codigoSNIES;
    }

    public void setCodigoSNIES(String codigoSNIES) {
        this.codigoSNIES = codigoSNIES;
    }

    public String getRegistro_calificado() {
        return registro_calificado;
    }

    public void setRegistro_calificado(String registro_calificado) {
        this.registro_calificado = registro_calificado;
    }

    public TipoProgramas getTipoprogramaId() {
        return tipoprogramaId;
    }

    public void setTipoprogramaId(TipoProgramas tipoprogramaId) {
        this.tipoprogramaId = tipoprogramaId;
    }
    
    public int getNum_semestres() {
        return num_semestres;
    }

    public void setNum_semestres(int num_semestres) {
        this.num_semestres = num_semestres;
    }

    public String getForm_academica() {
        return form_academica;
    }

    public void setForm_academica(String form_academica) {
        this.form_academica = form_academica;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
