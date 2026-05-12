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
@Table(name = "ghum_employees")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employees {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Persons personId;
    @Column
    private String marital_status;
    @Column
    private String emergency_contact;
    @Column
    private Double contact_phone;
    @Column
    private String schooling;
    @Column
    private Double contract;
    @Column
    private String profession;
    @JoinColumn(name = "id_temporary", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EntitiesTemporary temporaryId;
    @Column
    private String contract_type;
    @JoinColumn(name = "id_labor_dpto", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Departments laborDptoId;
    @JoinColumn(name = "id_labor_city", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Citys laborCityId;
    @JoinColumn(name = "id_eps", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EntitiesEps epsId;
    @JoinColumn(name = "id_ccf", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EntitiesCcf ccfId;
    @JoinColumn(name = "id_arl", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EntitiesArl arlId;
    @JoinColumn(name = "id_severance", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SeveranceFund severanceId;
    @JoinColumn(name = "id_pension", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PensionFund pensionId;
    @Column
    private Date entry_date;
    @Column
    private Date retirement_date;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Areas areaId;
    @JoinColumn(name = "id_charge", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persons getPersonId() {
        return personId;
    }

    public void setPersonId(Persons personId) {
        this.personId = personId;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }
    
    public String getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(String emergency_contact) {
        this.emergency_contact = emergency_contact;
    }

    public String getSchooling() {
        return schooling;
    }

    public void setSchooling(String schooling) {
        this.schooling = schooling;
    }

    public Double getContract() {
        return contract;
    }

    public void setContract(Double contract) {
        this.contract = contract;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public EntitiesTemporary getTemporaryId() {
        return temporaryId;
    }

    public void setTemporaryId(EntitiesTemporary temporaryId) {
        this.temporaryId = temporaryId;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public Departments getLaborDptoId() {
        return laborDptoId;
    }

    public void setLaborDptoId(Departments laborDptoId) {
        this.laborDptoId = laborDptoId;
    }

    public Citys getLaborCityId() {
        return laborCityId;
    }

    public void setLaborCityId(Citys laborCityId) {
        this.laborCityId = laborCityId;
    }

    public EntitiesEps getEpsId() {
        return epsId;
    }

    public void setEpsId(EntitiesEps epsId) {
        this.epsId = epsId;
    }

    public EntitiesCcf getCcfId() {
        return ccfId;
    }

    public void setCcfId(EntitiesCcf ccfId) {
        this.ccfId = ccfId;
    }

    public EntitiesArl getArlId() {
        return arlId;
    }

    public void setArlId(EntitiesArl arlId) {
        this.arlId = arlId;
    }

    public SeveranceFund getSeveranceId() {
        return severanceId;
    }

    public void setSeveranceId(SeveranceFund severanceId) {
        this.severanceId = severanceId;
    }

    public PensionFund getPensionId() {
        return pensionId;
    }

    public void setPensionId(PensionFund pensionId) {
        this.pensionId = pensionId;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public Date getRetirement_date() {
        return retirement_date;
    }

    public void setRetirement_date(Date retirement_date) {
        this.retirement_date = retirement_date;
    }

    public Areas getAreaId() {
        return areaId;
    }

    public void setAreaId(Areas areaId) {
        this.areaId = areaId;
    }

    public Charges getChargeId() {
        return chargeId;
    }

    public void setChargeId(Charges chargeId) {
        this.chargeId = chargeId;
    }

    public BigDecimal getExpense_fund() {
        return expense_fund;
    }

    public void setExpense_fund(BigDecimal expense_fund) {
        this.expense_fund = expense_fund;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public char getTypes_bonus() {
        return types_bonus;
    }

    public void setTypes_bonus(char types_bonus) {
        this.types_bonus = types_bonus;
    }

    public Double getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(Double contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getShirt_size() {
        return shirt_size;
    }

    public void setShirt_size(String shirt_size) {
        this.shirt_size = shirt_size;
    }

    public String getJeans_size() {
        return jeans_size;
    }

    public void setJeans_size(String jeans_size) {
        this.jeans_size = jeans_size;
    }

    public String getShoes_size() {
        return shoes_size;
    }

    public void setShoes_size(String shoes_size) {
        this.shoes_size = shoes_size;
    }

    public String getOveralls_size() {
        return overalls_size;
    }

    public void setOveralls_size(String overalls_size) {
        this.overalls_size = overalls_size;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
