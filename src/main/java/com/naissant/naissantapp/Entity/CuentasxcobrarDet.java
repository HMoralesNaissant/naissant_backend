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
@Table(name = "gen_cuentasxcobrar_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CuentasxcobrarDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_cuentasxcobrar", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cuentasxcobrar cuentasxcobrarId;
    @JoinColumn(name = "id_factura", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Facturas facturaId;
    @Column
    private Date fecha_abono;
    @Column
    private BigDecimal valor_abonos;
    @Column
    private BigDecimal descuento;
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

    public Cuentasxcobrar getCuentasxcobrarId() {
        return cuentasxcobrarId;
    }

    public void setCuentasxcobrarId(Cuentasxcobrar cuentasxcobrarId) {
        this.cuentasxcobrarId = cuentasxcobrarId;
    }

    public Facturas getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Facturas facturaId) {
        this.facturaId = facturaId;
    }

    public Date getFecha_abono() {
        return fecha_abono;
    }

    public void setFecha_abono(Date fecha_abono) {
        this.fecha_abono = fecha_abono;
    }

    public BigDecimal getValor_abonos() {
        return valor_abonos;
    }

    public void setValor_abonos(BigDecimal valor_abonos) {
        this.valor_abonos = valor_abonos;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
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
