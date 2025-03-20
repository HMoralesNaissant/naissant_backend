/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_calificacion_productos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalificacionProductos {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_tipo_producto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProductos tipoProductoId;
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Productos productoId;
    @JoinColumn(name = "id_evidencia", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Evidencias evidenciaId;
    @JoinColumn(name = "id_clasificacion", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private ClasificacionProductos clasificacionId;
    @Column
    private int participantes;
    @Column
    private String evaluacion;
    @Column
    private char aprobada;
    @Column
    private int calificacion;
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

    public TipoProductos getTipoProductoId() {
        return tipoProductoId;
    }

    public void setTipoProductoId(TipoProductos tipoProductoId) {
        this.tipoProductoId = tipoProductoId;
    }

    public Productos getProductoId() {
        return productoId;
    }

    public void setProductoId(Productos productoId) {
        this.productoId = productoId;
    }

    public Evidencias getEvidenciaId() {
        return evidenciaId;
    }

    public void setEvidenciaId(Evidencias evidenciaId) {
        this.evidenciaId = evidenciaId;
    }

    public ClasificacionProductos getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(ClasificacionProductos clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public char getAprobada() {
        return aprobada;
    }

    public void setAprobada(char aprobada) {
        this.aprobada = aprobada;
    }
    
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
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
