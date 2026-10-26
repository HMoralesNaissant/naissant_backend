
/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "port_reportados")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Reportados implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personaId;
    @Column(name = "fecha_reporte")
    @JsonProperty("fecha_reporte")
    private Date fechaReporte;
    @Column(name = "motivo_reporte")
    @JsonProperty("motivo_reporte")
    private String motivoReporte;
    @Column(name = "observaciones_rep")
    @JsonProperty("observaciones_rep")
    private String observacionesRep;
    @Column
    private char habilitado;
    @Column(name = "observaciones_hab")
    @JsonProperty("observaciones_hab")
    private String observacionesHab;
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

}
