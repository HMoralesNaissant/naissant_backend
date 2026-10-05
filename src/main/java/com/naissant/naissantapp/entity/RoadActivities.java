/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_road_activities")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class RoadActivities {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_road_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private RoadAdvisors roadAdvisorId;
    @JoinColumn(name = "id_procedure_activity", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProceduresActivities procedureActivityId;
    @Column
    private Date date_activity;
    @Column
    private Date start_hour;
    @Column
    private Date end_hour;
    @Column
    private BigDecimal latitude;
    @Column
    private BigDecimal longitude;
    @Column
    private String observations;
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
