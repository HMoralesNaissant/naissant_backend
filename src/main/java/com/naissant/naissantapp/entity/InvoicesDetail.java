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
@Table(name = "com_invoices_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class InvoicesDetail implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private InvoicesHeader invoiceId;
    @Column(name = "code_product")
    @JsonProperty("code_product")
    private String codeProduct;
    @Column
    private String product;
    @Column
    private Integer quantity;
    @Column(name = "unit_price")
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;
    @Column
    private BigDecimal total;
    @Column
    private String docentry;
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