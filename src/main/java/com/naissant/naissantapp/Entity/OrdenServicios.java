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
@Table(name = "codo_orden_servicios")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdenServicios {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_sucursal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Sucursal sucursalId;
    @Column(name= "num_recibo", nullable = true)
    private Double numRecibo;
    @Column
    private Date fecha_recibo;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EstudiantesClinicaOdo estudianteId;
    @Column
    private int semestre;
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pacientes pacienteId;
    @JoinColumn(name = "id_ano_semestre", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private AnoSemestre anoSemestreId;
    @Column
    private BigDecimal vr_total_recibo;
    @Column
    private char estado_recibo;
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

    public Double getNumRecibo() {
        return numRecibo;
    }

    public void setNumRecibo(Double numRecibo) {
        this.numRecibo = numRecibo;
    }

    public Date getFecha_recibo() {
        return fecha_recibo;
    }

    public void setFecha_recibo(Date fecha_recibo) {
        this.fecha_recibo = fecha_recibo;
    }

    public EstudiantesClinicaOdo getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(EstudiantesClinicaOdo estudianteId) {
        this.estudianteId = estudianteId;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Pacientes getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Pacientes pacienteId) {
        this.pacienteId = pacienteId;
    }

    public AnoSemestre getAnoSemestreId() {
        return anoSemestreId;
    }

    public void setAnoSemestreId(AnoSemestre anoSemestreId) {
        this.anoSemestreId = anoSemestreId;
    }

    public BigDecimal getVr_total_recibo() {
        return vr_total_recibo;
    }

    public void setVr_total_recibo(BigDecimal vr_total_recibo) {
        this.vr_total_recibo = vr_total_recibo;
    }

    public char getEstado_recibo() {
        return estado_recibo;
    }

    public void setEstado_recibo(char estado_recibo) {
        this.estado_recibo = estado_recibo;
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
