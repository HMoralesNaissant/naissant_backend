/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */
package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "conf_users")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Users implements Auditable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personId;
    @JoinColumn(name = "id_profile", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Profiles profileId;
    @Column(name = "user_name")
    private String userName;
    @Column
     //@JsonIgnore
    private String password;
    @Column(name = "id_photo_file", nullable = true)
    private Integer photoFileId;
    @Column
    private char status;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
