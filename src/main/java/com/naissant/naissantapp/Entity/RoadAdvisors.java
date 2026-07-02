/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "com_road_advisors")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoadAdvisors {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Advisors advisorId;
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customers customerId;
    @Column
    private String type_procedure;
    @Column
    private Date hour_visit;
    @Column
    private Date date_visit;
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

    public Advisors getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Advisors advisorId) {
        this.advisorId = advisorId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public String getType_procedure() {
        return type_procedure;
    }

    public void setType_procedure(String type_procedure) {
        this.type_procedure = type_procedure;
    }

    public Date getHour_visit() {
        return hour_visit;
    }

    public void setHour_visit(Date hour_visit) {
        this.hour_visit = hour_visit;
    }

    public Date getDate_visit() {
        return date_visit;
    }

    public void setDate_visit(Date date_visit) {
        this.date_visit = date_visit;
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
