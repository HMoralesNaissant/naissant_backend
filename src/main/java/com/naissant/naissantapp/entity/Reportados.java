
/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

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
    @Column
    private Date fecha_reporte;
    @Column
    private String motivo_reporte;
    @Column
    private String observaciones_rep;
    @Column
    private char habilitado;
    @Column
    private String observaciones_hab;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

}
