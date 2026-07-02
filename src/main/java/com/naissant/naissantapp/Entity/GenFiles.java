/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.naissant.naissantapp.Constants.GenFilesTypes;
import java.util.Date;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "gen_files")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenFiles {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "file_uuid")
    private String fileUUID;
    @Column(name = "name_file")
    private String nameFile;
    @Column
    private String description;
    @Column(name = "file_type")
    @Enumerated(EnumType.STRING)
    private GenFilesTypes fileType;
    @Column
    private String url;
    @Column(name = "type_file" )
    private String typeFile;
    @Column
    private Double size;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

    
    public GenFiles() {
    }

    public GenFiles(int id) {
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

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GenFilesTypes getFileType() {
        return fileType;
    }

    public void setFileType(GenFilesTypes fileType) {
        this.fileType = fileType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
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
