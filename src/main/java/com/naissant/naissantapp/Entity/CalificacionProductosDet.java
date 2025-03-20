/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_calificacion_productos_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CalificacionProductosDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_calificacion", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private CalificacionProductos calificacionId;
    @JoinColumn(name = "id_investigador", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Investigadores investigadorId;
    @Column(name = "rol_investigador")
    private char rolInvestigador;
    @Column
    private int puntaje;
    @Column
    private BigDecimal porcentaje;
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

    public CalificacionProductos getCalificacionId() {
        return calificacionId;
    }

    public void setCalificacionId(CalificacionProductos calificacionId) {
        this.calificacionId = calificacionId;
    }

    public Investigadores getInvestigadorId() {
        return investigadorId;
    }

    public void setInvestigadorId(Investigadores investigadorId) {
        this.investigadorId = investigadorId;
    }

    public char getRolInvestigador() {
        return rolInvestigador;
    }

    public void setRolInvestigador(char rolInvestigador) {
        this.rolInvestigador = rolInvestigador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
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
