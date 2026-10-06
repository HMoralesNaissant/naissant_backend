/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */
package com.naissant.naissantapp.entity;

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
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

    public void add() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
