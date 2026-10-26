/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.naissant.naissantapp.constants.GenFilesTypes;
import java.util.Date;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "gen_files")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class GenFiles implements Auditable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "file_uuid")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
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
    @Column(name = "user_create")
    @JsonProperty("user_create")
    private String userCreate;
    @Column(name = "date_create")
    @JsonProperty("date_create")
    private Date dateCreate;
    @Column(name = "user_update")
    @JsonProperty("user_update")
    private String userUpdate;
    @Column(name = "date_update")
    @JsonProperty("date_update")
    private Date dateUpdate;

    
    public GenFiles() {
    }

    public GenFiles(int id) {
        this.id = id;
    }
    
    @PrePersist
    private void prePersist(){
        this.fileUUID = UUID.randomUUID().toString();
    }

}
