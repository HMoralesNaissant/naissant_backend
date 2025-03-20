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
@Table(name = "codo_orden_servicios_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdenServiciosDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_orden_servicio", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private OrdenServicios ordenServicioId;
    @JoinColumn(name = "id_concepto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Conceptos conceptoId;
    @JoinColumn(name = "id_procedimiento", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Procedimientos procedimientoId;
    @Column
    private Double cantidad;
    @Column
    private BigDecimal valor_unitario;
    @Column
    private BigDecimal valor_total;
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

    public OrdenServicios getOrdenServicioId() {
        return ordenServicioId;
    }

    public void setOrdenServicioId(OrdenServicios ordenServicioId) {
        this.ordenServicioId = ordenServicioId;
    }

    public Conceptos getConceptoId() {
        return conceptoId;
    }

    public void setConceptoId(Conceptos conceptoId) {
        this.conceptoId = conceptoId;
    }

    public Procedimientos getProcedimientoId() {
        return procedimientoId;
    }

    public void setProcedimientoId(Procedimientos procedimientoId) {
        this.procedimientoId = procedimientoId;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
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
