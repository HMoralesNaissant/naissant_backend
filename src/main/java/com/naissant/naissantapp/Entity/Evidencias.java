/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_evidencias")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Evidencias {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_proyecto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Proyectos proyectoId;
    @Column
    private String nombre;
    @JoinColumn(name = "id_grupo_investigacion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private GruposInvestigacion grupoInvestigacionId;
    @Column(name= "id_archivo", nullable = true)
    private Integer archivoId;
    @JoinColumn(name = "id_tipo_producto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoProductos tipoProductoId;
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Productos productoId;
    @JoinColumn(name = "id_clasificacion", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private ClasificacionProductos clasificacionId;
    @Column
    private char calificado;
    @Column
    private int anio;
    @Column
    private String mes;
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

    public Proyectos getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Proyectos proyectoId) {
        this.proyectoId = proyectoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GruposInvestigacion getGrupoInvestigacionId() {
        return grupoInvestigacionId;
    }

    public void setGrupoInvestigacionId(GruposInvestigacion grupoInvestigacionId) {
        this.grupoInvestigacionId = grupoInvestigacionId;
    }

    public Integer getArchivoId() {
        return archivoId;
    }

    public void setArchivoId(Integer archivoId) {
        this.archivoId = archivoId;
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

    public ClasificacionProductos getClasificacionId() {
        return clasificacionId;
    }

    public void setClasificacionId(ClasificacionProductos clasificacionId) {
        this.clasificacionId = clasificacionId;
    }

    public char getCalificado() {
        return calificado;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setCalificado(char calificado) {
        this.calificado = calificado;
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

}
