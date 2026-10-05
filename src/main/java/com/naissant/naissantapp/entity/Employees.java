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
@Table(name = "ghum_employees")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Employees {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personId;
    @Column
    private String marital_status;
    @Column
    private String emergency_contact;
    @Column
    private String contact_phone;
    @Column
    private String schooling;
    @Column
    private String contract;
    @Column
    private String profession;
    @JoinColumn(name = "id_temporary", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntitiesTemporary temporaryId;
    @Column
    private String contract_type;
    @JoinColumn(name = "id_labor_dpto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departments laborDptoId;
    @JoinColumn(name = "id_labor_city", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys laborCityId;
    @JoinColumn(name = "id_eps", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntitiesEps epsId;
    @JoinColumn(name = "id_ccf", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntitiesCcf ccfId;
    @JoinColumn(name = "id_arl", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntitiesArl arlId;
    @JoinColumn(name = "id_severance", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SeveranceFund severanceId;
    @JoinColumn(name = "id_pension", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PensionFund pensionId;
    @Column
    private Date entry_date;
    @Column
    private Date retirement_date;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Areas areaId;
    @JoinColumn(name = "id_charge", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Charges chargeId;
    @Column
    private BigDecimal expense_fund;
    @Column
    private BigDecimal salary;
    @Column
    private BigDecimal bonus;
    @Column
    private char types_bonus;
    @Column
    private String shirt_size;
    @Column
    private String jeans_size;
    @Column
    private String shoes_size;
    @Column
    private String overalls_size;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
