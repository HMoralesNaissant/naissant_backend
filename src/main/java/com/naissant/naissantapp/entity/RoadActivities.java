/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class RoadActivities implements Auditable {
    
    
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
    @Column(name = "date_activity")
    @JsonProperty("date_activity")
    private Date dateActivity;
    @Column(name = "start_hour")
    @JsonProperty("start_hour")
    private Date startHour;
    @Column(name = "end_hour")
    @JsonProperty("end_hour")
    private Date endHour;
    @Column
    private BigDecimal latitude;
    @Column
    private BigDecimal longitude;
    @Column
    private String observations;
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
