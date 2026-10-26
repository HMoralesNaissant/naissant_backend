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
@Table(name = "com_advisors")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Advisors implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employees employeeId;
    @Column(name = "code_sap")
    @JsonProperty("code_sap")
    private Double codeSap;
    @JoinColumn(name = "id_zone", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Zones zoneId;
    @Column(name = "sales_goal")
    @JsonProperty("sales_goal")
    private Double salesGoal;
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
