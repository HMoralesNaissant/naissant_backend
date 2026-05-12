/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "com_advisors")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Advisors {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Employees employeeId;
    @Column
    private Double code_sap;
    @JoinColumn(name = "id_zone", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Zones zoneId;
    @Column
    private Double sales_goal;
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

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }

    public Double getCode_sap() {
        return code_sap;
    }

    public void setCode_sap(Double code_sap) {
        this.code_sap = code_sap;
    }

    public Zones getZoneId() {
        return zoneId;
    }

    public void setZoneId(Zones zoneId) {
        this.zoneId = zoneId;
    }

    public Double getSales_goal() {
        return sales_goal;
    }

    public void setSales_goal(Double sales_goal) {
        this.sales_goal = sales_goal;
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
