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
@Table(name = "gen_facturas")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Facturas {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sucursal sucursalId;
    @JoinColumn(name = "id_orden_servicio", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private OrdenServicios ordenServicioId;
    @JoinColumn(name = "id_caja", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cajas cajaId;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudiantesClinicaOdo estudianteId;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pacientes pacienteId;
    @Column
    private String prefijo_num;
    @Column(name= "num_factura", nullable = true)
    private Double numFactura;
    @Column
    private Date fecha_factura;
    @Column
    private Double cant_items;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal porc_desc;
    @Column
    private BigDecimal descuento;
    @Column
    private BigDecimal vr_total;
    @JoinColumn(name = "id_forma_pago", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private FormasPagos formaPagoId;
    @Column
    private char factura_electronica;
    @Column
    private String num_factura_elect;
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

    public OrdenServicios getOrdenServicioId() {
        return ordenServicioId;
    }

    public void setOrdenServicioId(OrdenServicios ordenServicioId) {
        this.ordenServicioId = ordenServicioId;
    }

    public Cajas getCajaId() {
        return cajaId;
    }

    public void setCajaId(Cajas cajaId) {
        this.cajaId = cajaId;
    }

    public EstudiantesClinicaOdo getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(EstudiantesClinicaOdo estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getPrefijo_num() {
        return prefijo_num;
    }

    public void setPrefijo_num(String prefijo_num) {
        this.prefijo_num = prefijo_num;
    }

    public Double getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Double numFactura) {
        this.numFactura = numFactura;
    }

    public Date getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(Date fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public Double getCant_items() {
        return cant_items;
    }

    public void setCant_items(Double cant_items) {
        this.cant_items = cant_items;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getPorc_desc() {
        return porc_desc;
    }

    public void setPorc_desc(BigDecimal porc_desc) {
        this.porc_desc = porc_desc;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getVr_total() {
        return vr_total;
    }

    public void setVr_total(BigDecimal vr_total) {
        this.vr_total = vr_total;
    }

    public FormasPagos getFormaPagoId() {
        return formaPagoId;
    }

    public void setFormaPagoId(FormasPagos formaPagoId) {
        this.formaPagoId = formaPagoId;
    }

    public char getFactura_electronica() {
        return factura_electronica;
    }

    public void setFactura_electronica(char factura_electronica) {
        this.factura_electronica = factura_electronica;
    }

    public String getNum_factura_elect() {
        return num_factura_elect;
    }

    public void setNum_factura_elect(String num_factura_elect) {
        this.num_factura_elect = num_factura_elect;
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
