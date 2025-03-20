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
@Table(name = "gen_facturas_pagos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacturasPagos {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_factura", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Facturas facturaId;
    @JoinColumn(name = "id_medio_pago", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private MediosPagos medioPagoId;
    @Column
    private BigDecimal valor;
    @JoinColumn(name = "id_banco", referencedColumnName = "id", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private Bancos bancoId;
    @JoinColumn(name = "id_franquicia", referencedColumnName = "id", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private Franquicias franquiciaId;
    @Column
    private String num_aprobacion;
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

    public Facturas getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Facturas facturaId) {
        this.facturaId = facturaId;
    }

    public MediosPagos getMedioPagoId() {
        return medioPagoId;
    }

    public void setMedioPagoId(MediosPagos medioPagoId) {
        this.medioPagoId = medioPagoId;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Bancos getBancoId() {
        return bancoId;
    }

    public void setBancoId(Bancos bancoId) {
        this.bancoId = bancoId;
    }

    public Franquicias getFranquiciaId() {
        return franquiciaId;
    }

    public void setFranquiciaId(Franquicias franquiciaId) {
        this.franquiciaId = franquiciaId;
    }

    public String getNum_aprobacion() {
        return num_aprobacion;
    }

    public void setNum_aprobacion(String num_aprobacion) {
        this.num_aprobacion = num_aprobacion;
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
