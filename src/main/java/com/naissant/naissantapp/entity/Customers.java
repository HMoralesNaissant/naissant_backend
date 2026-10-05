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
@Table(name = "com_customers")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Customers {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Persons personId;
    @Column
    @JoinColumn(name = "company_code")
    private String companyCode;
    @Column
    private String company_name;
    @Column
    private String branch_address;
    @JoinColumn(name = "id_city_branch", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys cityBranchId;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Advisors advisorId;
    @JoinColumn(name = "id_zone", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Zones zoneId;
    @Column
    private String type_person;
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

}
