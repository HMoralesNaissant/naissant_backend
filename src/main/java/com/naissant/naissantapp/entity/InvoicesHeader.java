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
@Table(name = "com_invoices_header")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class InvoicesHeader {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private Double invoice;
    @Column
    private Date invoice_date;
    @Column
    private String customer_code;
    @Column
    private Double nit;
    @Column
    private String customer;
    @Column
    private String branch_address;
    @Column
    private String payment_forms;
    @Column
    private Double total_items;
    @Column
    private Double total_units;
    @Column
    private Date expiration_date;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal iva;
    @Column
    private BigDecimal total;
    @Column
    private Double orders_num;
    @Column
    private Double advisor_code;
    @Column
    private String observations;
    @Column
    private Double docentry;
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
