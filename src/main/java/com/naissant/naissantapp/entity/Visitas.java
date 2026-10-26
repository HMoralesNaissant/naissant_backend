
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
@Table(name = "port_visitas")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Visitas implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personaId;
    @Column
    private String empresa;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Areas areaId;
    @Column
    private String empleado;
    @JoinColumn(name = "id_cargo", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Charges cargoId;
    @Column(name = "fecha_visita")
    @JsonProperty("fecha_visita")
    private Date fechaVisita;
    @Column(name = "hora_ingreso")
    @JsonProperty("hora_ingreso")
    private Date horaIngreso;
    @Column(name = "hora_salida")
    @JsonProperty("hora_salida")
    private Date horaSalida;
    @Column
    private String observacion;
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

}
