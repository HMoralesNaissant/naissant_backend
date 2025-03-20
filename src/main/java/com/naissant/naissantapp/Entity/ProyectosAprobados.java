/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_proyectos_aprobados")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProyectosAprobados {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Proyectos proyectoId;
    @Column(name = "vb_cientifico" )
    private char vbCientifico;
    @Column(name= "id_archivo_cie", nullable = true)
    private Integer archivoCieId;
    @Column
    private int puntaje;
    @Column(name = "vb_bioetico" )
    private char vbBioetico;
    @Column(name= "id_archivo_bio", nullable = true)
    private Integer archivoBioId;
    @Column(name = "acuerdo_cientifico" )
    private char acuerdoCientifico;
    @Column(name= "id_archivo_acu", nullable = true)
    private Integer archivoAcuId;
    @Column(name = "fecha_presentacion" )
    private Date fechaPresentacion;
    @Column(name = "codigo_aprobacion" )
    private String codigoAprobacion;
    @Column(name = "fecha_aprobacion" )
    private Date fechaAprobacion;
    @Column(name = "fecha_aprob_bioetica" )
    private Date fechaAprobBioetica;
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

    public char getVbCientifico() {
        return vbCientifico;
    }

    public void setVbCientifico(char vbCientifico) {
        this.vbCientifico = vbCientifico;
    }

    public Integer getArchivoCieId() {
        return archivoCieId;
    }

    public void setArchivoCieId(Integer archivoCieId) {
        this.archivoCieId = archivoCieId;
    }
    
    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public char getVbBioetico() {
        return vbBioetico;
    }

    public void setVbBioetico(char vbBioetico) {
        this.vbBioetico = vbBioetico;
    }

    public Integer getArchivoBioId() {
        return archivoBioId;
    }

    public void setArchivoBioId(Integer archivoBioId) {
        this.archivoBioId = archivoBioId;
    }

    public char getAcuerdoCientifico() {
        return acuerdoCientifico;
    }

    public void setAcuerdoCientifico(char acuerdoCientifico) {
        this.acuerdoCientifico = acuerdoCientifico;
    }

    public Integer getArchivoAcuId() {
        return archivoAcuId;
    }

    public void setArchivoAcuId(Integer archivoAcuId) {
        this.archivoAcuId = archivoAcuId;
    }

    public Date getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(Date fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }
    
    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Date getFechaAprobBioetica() {
        return fechaAprobBioetica;
    }

    public void setFechaAprobBioetica(Date fechaAprobBioetica) {
        this.fechaAprobBioetica = fechaAprobBioetica;
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
