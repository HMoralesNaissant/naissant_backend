/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "com_road_activities")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoadActivities {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_road_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private RoadAdvisors roadAdvisorId;
    @JoinColumn(name = "id_procedure_activity", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoadAdvisors getRoadAdvisorId() {
        return roadAdvisorId;
    }

    public void setRoadAdvisorId(RoadAdvisors roadAdvisorId) {
        this.roadAdvisorId = roadAdvisorId;
    }

    public ProceduresActivities getProcedureActivityId() {
        return procedureActivityId;
    }

    public void setProcedureActivityId(ProceduresActivities procedureActivityId) {
        this.procedureActivityId = procedureActivityId;
    }

    public Date getDate_activity() {
        return date_activity;
    }

    public void setDate_activity(Date date_activity) {
        this.date_activity = date_activity;
    }

    public Date getStart_hour() {
        return start_hour;
    }

    public void setStart_hour(Date start_hour) {
        this.start_hour = start_hour;
    }

    public Date getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(Date end_hour) {
        this.end_hour = end_hour;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
    
    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getUser_update() {
        return user_update;
    }

    public void setUser_update(String user_update) {
        this.user_update = user_update;
    }

    public Date getDate_update() {
        return date_update;
    }

    public void setDate_update(Date date_update) {
        this.date_update = date_update;
    }
    
}
