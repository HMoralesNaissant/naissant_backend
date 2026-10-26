/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "ghum_employees_hist")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class EmployeesHist implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employees employeeId;
    @Column(name = "contract_type")
    @JsonProperty("contract_type")
    private String contractType;
    @Column
    private Double contract;
    @Column
    private BigDecimal salary;
    @Column
    private BigDecimal bonus;
    @Column(name = "types_bonus")
    @JsonProperty("types_bonus")
    private char typesBonus;
    @Column(name = "entry_date")
    @JsonProperty("entry_date")
    private Date entryDate;
    @Column(name = "retirement_date")
    @JsonProperty("retirement_date")
    private Date retirementDate;
    @Column
    private String observations;
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
