/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "adm_actas_grados")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActasGrados {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Estudiantes estudianteId;
    @Column
    private String acta_grado;
    @Column
    private String pazysalvo;
    @Column
    private int no_grado;
    @Column
    private Date fecha_grado;
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

    public Estudiantes getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Estudiantes estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getActa_grado() {
        return acta_grado;
    }

    public void setActa_grado(String acta_grado) {
        this.acta_grado = acta_grado;
    }

    public String getPazysalvo() {
        return pazysalvo;
    }

    public void setPazysalvo(String pazysalvo) {
        this.pazysalvo = pazysalvo;
    }

    public int getNo_grado() {
        return no_grado;
    }

    public void setNo_grado(int no_grado) {
        this.no_grado = no_grado;
    }

    public Date getFecha_grado() {
        return fecha_grado;
    }

    public void setFecha_grado(Date fecha_grado) {
        this.fecha_grado = fecha_grado;
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
