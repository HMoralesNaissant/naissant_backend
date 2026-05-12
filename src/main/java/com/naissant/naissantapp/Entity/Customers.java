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
@Table(name = "com_customers")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customers {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Persons personId;
    @Column
    private String company_code;
    @Column
    private String company_name;
    @Column
    private String branch_address;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Advisors advisorId;
    @JoinColumn(name = "id_zone", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Zones zoneId;
    @Column
    private String type_person;
    @JoinColumn(name = "id_economic_activity", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private EconomicActivity economicActivityId;
    @JoinColumn(name = "id_payment_form", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PaymentForms paymentFormId;
    @Column
    private BigDecimal quota;
    @JoinColumn(name = "id_sale_channel", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private SalesChannels saleChannelId;
    @Column
    private String tax_regime;
    @Column
    private String self_retaining;
    @Column
    private String type_customer;
    @Column
    private String currency;
    @Column
    private BigDecimal credit_limit;
    @Column
    private BigDecimal committed_limit;
    @Column
    private String fiscal_regime;
    @Column
    private String fiscal_responsibility;
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

    public String getCompany_code() {
        return company_code;
    }

    public void setCompany_code(String company_code) {
        this.company_code = company_code;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }
    
    public Advisors getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Advisors advisorId) {
        this.advisorId = advisorId;
    }

    public Zones getZoneId() {
        return zoneId;
    }

    public void setZoneId(Zones zoneId) {
        this.zoneId = zoneId;
    }
    
    public String getType_person() {
        return type_person;
    }

    public void setType_person(String type_person) {
        this.type_person = type_person;
    }

    public EconomicActivity getEconomicActivityId() {
        return economicActivityId;
    }

    public void setEconomicActivityId(EconomicActivity economicActivityId) {
        this.economicActivityId = economicActivityId;
    }

    public PaymentForms getPaymentFormId() {
        return paymentFormId;
    }

    public void setPaymentFormId(PaymentForms paymentFormId) {
        this.paymentFormId = paymentFormId;
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }
    
    public SalesChannels getSaleChannelId() {
        return saleChannelId;
    }

    public void setSaleChannelId(SalesChannels saleChannelId) {
        this.saleChannelId = saleChannelId;
    }

    public String getTax_regime() {
        return tax_regime;
    }

    public void setTax_regime(String tax_regime) {
        this.tax_regime = tax_regime;
    }

    public String getSelf_retaining() {
        return self_retaining;
    }

    public void setSelf_retaining(String self_retaining) {
        this.self_retaining = self_retaining;
    }

    public String getType_customer() {
        return type_customer;
    }

    public void setType_customer(String type_customer) {
        this.type_customer = type_customer;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(BigDecimal credit_limit) {
        this.credit_limit = credit_limit;
    }

    public BigDecimal getCommitted_limit() {
        return committed_limit;
    }

    public void setCommitted_limit(BigDecimal committed_limit) {
        this.committed_limit = committed_limit;
    }

    public String getFiscal_regime() {
        return fiscal_regime;
    }

    public void setFiscal_regime(String fiscal_regime) {
        this.fiscal_regime = fiscal_regime;
    }

    public String getFiscal_responsibility() {
        return fiscal_responsibility;
    }

    public void setFiscal_responsibility(String fiscal_responsibility) {
        this.fiscal_responsibility = fiscal_responsibility;
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
