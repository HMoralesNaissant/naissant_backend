/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gen_arqueos_cajas")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArqueosCajas {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sucursal sucursalId;
    @JoinColumn(name = "id_caja", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cajas cajaId;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios usuarioId;
    @Column(name= "num_arqueo", nullable = true)
    private Double numArqueo;
    @Column
    private String prefijo_num;
    @Column
    private Date fecha_apertura;
    @Column
    private Date hora_apertura;
    @Column
    private BigDecimal valor_apertura;
    @Column
    private Date fecha_cierre;
    @Column
    private Date hora_cierre;
    @Column
    private BigDecimal valor_cierre;
    @Column
    private BigDecimal valor_sistema;
    @Column
    private BigDecimal valor_diferencia;
    @Column
    private String observacion;
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

    public Sucursal getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Sucursal sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Cajas getCajaId() {
        return cajaId;
    }

    public void setCajaId(Cajas cajaId) {
        this.cajaId = cajaId;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Double getNumArqueo() {
        return numArqueo;
    }

    public void setNumArqueo(Double numArqueo) {
        this.numArqueo = numArqueo;
    }

    public String getPrefijo_num() {
        return prefijo_num;
    }

    public void setPrefijo_num(String prefijo_num) {
        this.prefijo_num = prefijo_num;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public Date getHora_apertura() {
        return hora_apertura;
    }

    public void setHora_apertura(Date hora_apertura) {
        this.hora_apertura = hora_apertura;
    }

    public BigDecimal getValor_apertura() {
        return valor_apertura;
    }

    public void setValor_apertura(BigDecimal valor_apertura) {
        this.valor_apertura = valor_apertura;
    }

    public Date getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public Date getHora_cierre() {
        return hora_cierre;
    }

    public void setHora_cierre(Date hora_cierre) {
        this.hora_cierre = hora_cierre;
    }

    public BigDecimal getValor_cierre() {
        return valor_cierre;
    }

    public void setValor_cierre(BigDecimal valor_cierre) {
        this.valor_cierre = valor_cierre;
    }

    public BigDecimal getValor_sistema() {
        return valor_sistema;
    }

    public void setValor_sistema(BigDecimal valor_sistema) {
        this.valor_sistema = valor_sistema;
    }

    public BigDecimal getValor_diferencia() {
        return valor_diferencia;
    }

    public void setValor_diferencia(BigDecimal valor_diferencia) {
        this.valor_diferencia = valor_diferencia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
