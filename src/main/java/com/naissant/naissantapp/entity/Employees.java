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
@Table(name = "ghum_employees")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Employees implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personId;
    @Column(name = "marital_status")
    @JsonProperty("marital_status")
    private String maritalStatus;
    @Column(name = "emergency_contact")
    @JsonProperty("emergency_contact")
    private String emergencyContact;
    @Column(name = "contact_phone")
    @JsonProperty("contact_phone")
    private String contactPhone;
    @Column
    private String schooling;
    @Column
    private String contract;
    @Column
    private String profession;
    @JoinColumn(name = "id_temporary", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EntitiesTemporary temporaryId;
    @Column(name = "contract_type")
    @JsonProperty("contract_type")
    private String contractType;
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
    @Column(name = "entry_date")
    @JsonProperty("entry_date")
    private Date entryDate;
    @Column(name = "retirement_date")
    @JsonProperty("retirement_date")
    private Date retirementDate;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Areas areaId;
    @JoinColumn(name = "id_charge", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Charges chargeId;
    @Column(name = "expense_fund")
    @JsonProperty("expense_fund")
    private BigDecimal expenseFund;
    @Column
    private BigDecimal salary;
    @Column
    private BigDecimal bonus;
    @Column(name = "types_bonus")
    @JsonProperty("types_bonus")
    private char typesBonus;
    @Column(name = "shirt_size")
    @JsonProperty("shirt_size")
    private String shirtSize;
    @Column(name = "jeans_size")
    @JsonProperty("jeans_size")
    private String jeansSize;
    @Column(name = "shoes_size")
    @JsonProperty("shoes_size")
    private String shoesSize;
    @Column(name = "overalls_size")
    @JsonProperty("overalls_size")
    private String overallsSize;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
