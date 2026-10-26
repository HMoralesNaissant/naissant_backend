/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "port_visitantes")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Visitantes implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "id_archivo", nullable = true)
    private Integer archivoId;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personaId;
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
