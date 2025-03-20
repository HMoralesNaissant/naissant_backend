/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "adm_digitalizacion")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Digitalizacion {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Estudiantes estudianteId;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Documentos tipoDocumentoId;
    @Column(name= "id_archivo", nullable = true)
    private Integer archivoId;
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

    public Estudiantes getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Estudiantes estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Documentos getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    public void setTipoDocumentoId(Documentos tipoDocumentoId) {
        this.tipoDocumentoId = tipoDocumentoId;
    }

    public Integer getArchivoId() {
        return archivoId;
    }

    public void setArchivoId(Integer archivoId) {
        this.archivoId = archivoId;
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
}
