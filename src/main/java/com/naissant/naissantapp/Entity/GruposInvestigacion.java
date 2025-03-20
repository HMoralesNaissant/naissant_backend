/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro  - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_grupos_investigacion")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GruposInvestigacion {
    
    
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
    private String codigo_colciencias;
    @Column
    private String liderId;
    @Column
    private Date fecha_creacion;
    @Column
    private Date fecha_vigencia;
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

    public String getCodigo_colciencias() {
        return codigo_colciencias;
    }

    public void setCodigo_colciencias(String codigo_colciencias) {
        this.codigo_colciencias = codigo_colciencias;
    }

    
    public String getLiderId() {
        return liderId;
    }

    public void setLiderId(String liderId) {    
        this.liderId = liderId;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_vigencia() {
        return fecha_vigencia;
    }

    public void setFecha_vigencia(Date fecha_vigencia) {
        this.fecha_vigencia = fecha_vigencia;
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
