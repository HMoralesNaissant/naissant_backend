
/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

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
public class Visitas {
    
    
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
    @Column
    private Date fecha_visita;
    @Column
    private Date hora_ingreso;
    @Column
    private Date hora_salida;
    @Column
    private String observacion;
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

}
