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
@Table(name = "gen_movimientos_cajas")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovimientosCajas {
    
    
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
    @Column(name= "num_documento", nullable = true)
    private Double numDocumento;
    @Column
    private String prefijo_num;
    @Column
    private String movimiento;
    @Column
    private BigDecimal valor;
    @JoinColumn(name = "id_medio_pago", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private MediosPagos medioPagoId;
    @Column
    private Date fecha;
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

    public Double getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Double numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getPrefijo_num() {
        return prefijo_num;
    }

    public void setPrefijo_num(String prefijo_num) {
        this.prefijo_num = prefijo_num;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public MediosPagos getMedioPagoId() {
        return medioPagoId;
    }

    public void setMedioPagoId(MediosPagos medioPagoId) {
        this.medioPagoId = medioPagoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
