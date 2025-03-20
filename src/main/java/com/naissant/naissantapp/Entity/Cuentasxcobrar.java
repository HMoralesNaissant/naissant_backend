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
@Table(name = "gen_cuentasxcobrar")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cuentasxcobrar {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "num_cxc", nullable = true)
    private Double numCxc;
    @Column
    private String prefijo_num;
    @JoinColumn(name = "id_factura", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Facturas facturaId;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudiantesClinicaOdo estudianteId;
    @JoinColumn(name = "id_ano_semestre", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private AnoSemestre anoSemestreId;
    @Column
    private Double semestre;
    @Column
    private Date fecha_cxc;
    @Column
    private Date fecha_vencimiento;
    @Column
    private BigDecimal valor_cxc;
    @Column
    private BigDecimal valor_abonos;
    @Column
    private BigDecimal valor_saldo;
    @Column
    private BigDecimal descuento;
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

    public Double getNumCxc() {
        return numCxc;
    }

    public void setNumCxc(Double numCxc) {
        this.numCxc = numCxc;
    }

    public String getPrefijo_num() {
        return prefijo_num;
    }

    public void setPrefijo_num(String prefijo_num) {
        this.prefijo_num = prefijo_num;
    }

    public Facturas getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Facturas facturaId) {
        this.facturaId = facturaId;
    }

    public EstudiantesClinicaOdo getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(EstudiantesClinicaOdo estudianteId) {
        this.estudianteId = estudianteId;
    }

    public AnoSemestre getAnoSemestreId() {
        return anoSemestreId;
    }

    public void setAnoSemestreId(AnoSemestre anoSemestreId) {
        this.anoSemestreId = anoSemestreId;
    }

    public Double getSemestre() {
        return semestre;
    }

    public void setSemestre(Double semestre) {
        this.semestre = semestre;
    }

    public Date getFecha_cxc() {
        return fecha_cxc;
    }

    public void setFecha_cxc(Date fecha_cxc) {
        this.fecha_cxc = fecha_cxc;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public BigDecimal getValor_cxc() {
        return valor_cxc;
    }

    public void setValor_cxc(BigDecimal valor_cxc) {
        this.valor_cxc = valor_cxc;
    }

    public BigDecimal getValor_abonos() {
        return valor_abonos;
    }

    public void setValor_abonos(BigDecimal valor_abonos) {
        this.valor_abonos = valor_abonos;
    }

    public BigDecimal getValor_saldo() {
        return valor_saldo;
    }

    public void setValor_saldo(BigDecimal valor_saldo) {
        this.valor_saldo = valor_saldo;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
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
