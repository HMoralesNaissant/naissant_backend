/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.naissant.naissantapp.Constants.GenArchivosTypes;
import java.util.Date;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "gen_archivos")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenArchivos {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "file_uuid")
    private String fileUUID;
    @Column(name = "nombre_archivo")
    private String nombreArchivo;
    @Column
    private String descripcion;
    @Column(name = "file_type")
    @Enumerated(EnumType.STRING)
    private GenArchivosTypes fileType;
    @Column
    private String url;
    @Column(name = "tipo_archivo" )
    private String tipoArchivo;
    @Column
    private Double tamano;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

    public GenArchivos() {
    }

    public GenArchivos(int id) {
        this.id = id;
    }
    
    

    @PrePersist
    private void prePersist(){
        this.fileUUID = UUID.randomUUID().toString();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
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

    public GenArchivosTypes getFileType() {
        return fileType;
    }

    public void setFileType(GenArchivosTypes fileType) {
        this.fileType = fileType;
    }

   
    
    

}
