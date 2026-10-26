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
@Table(name = "com_customers")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Customers implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personId;
    @Column(name = "customer_code")
    @JoinColumn(name = "customer_code")
    @JsonProperty("customer_code")
    private String customerCode;
    @Column(name = "company_name")
    @JsonProperty("company_name")
    private String companyName;
    @Column(name = "branch_address")
    @JsonProperty("branch_address")
    private String branchAddress;
    @JoinColumn(name = "id_city_branch", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys cityBranchId;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Advisors advisorId;
    @JoinColumn(name = "id_zone", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Zones zoneId;
    @Column(name = "type_person")
    @JsonProperty("type_person")
    private String typePerson;
    @JoinColumn(name = "id_economic_activity", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EconomicActivity economicActivityId;
    @JoinColumn(name = "id_payment_form", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PaymentForms paymentFormId;
    @Column
    private BigDecimal quota;
    @JoinColumn(name = "id_sale_channel", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private SalesChannels saleChannelId;
    @Column(name = "tax_regime")
    @JsonProperty("tax_regime")
    private String taxRegime;
    @Column(name = "self_retaining")
    @JsonProperty("self_retaining")
    private String selfRetaining;
    @Column(name = "type_customer")
    @JsonProperty("type_customer")
    private String typeCustomer;
    @Column
    private String currency;
    @Column(name = "credit_limit")
    @JsonProperty("credit_limit")
    private BigDecimal creditLimit;
    @Column(name = "committed_limit")
    @JsonProperty("committed_limit")
    private BigDecimal committedLimit;
    @Column(name = "fiscal_regime")
    @JsonProperty("fiscal_regime")
    private String fiscalRegime;
    @Column(name = "fiscal_responsibility")
    @JsonProperty("fiscal_responsibility")
    private String fiscalResponsibility;
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
