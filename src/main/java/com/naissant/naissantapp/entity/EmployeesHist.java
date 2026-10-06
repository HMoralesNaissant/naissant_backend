/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

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
    @Column
    private String contract_type;
    @Column
    private Double contract;
    @Column
    private BigDecimal salary;
    @Column
    private BigDecimal bonus;
    @Column
    private char types_bonus;
    @Column
    private Date entry_date;
    @Column
    private Date retirement_date;
    @Column
    private String observations;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

}
