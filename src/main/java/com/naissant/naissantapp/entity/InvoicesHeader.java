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
@Table(name = "com_invoices_header")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class InvoicesHeader implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private String invoice;
    @Column(name = "invoice_date")
    @JsonProperty("invoice_date")
    private Date invoiceDate;
    @Column(name = "customer_code")
    @JsonProperty("customer_code")
    private String customerCode;
    @Column
    private String nit;
    @Column
    private String customer;
    @Column(name = "branch_address")
    @JsonProperty("branch_address")
    private String branchAddress;
    @Column(name = "payment_forms")
    @JsonProperty("payment_forms")
    private String paymentForms;
    @Column(name = "total_items")
    @JsonProperty("total_items")
    private Integer totalItems;
    @Column(name = "total_units")
    @JsonProperty("total_units")
    private Integer totalUnits;
    @Column(name = "expiration_date")
    @JsonProperty("expiration_date")
    private Date expirationDate;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal iva;
    @Column
    private BigDecimal total;
    @Column(name = "orders_num")
    @JsonProperty("orders_num")
    private String ordersNum;
    @Column(name = "advisor_code")
    @JsonProperty("advisor_code")
    private String advisorCode;
    @Column
    private String observations;
    @Column(name = "docentry")
    @JsonProperty("docentry")
    private String docEntry;
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