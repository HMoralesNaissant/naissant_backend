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
public class InvoicesHeader implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private Integer invoice;
    @Column
    private Date invoice_date;
    @Column
    private String customer_code;
    @Column
    private Integer nit;
    @Column
    private String customer;
    @Column
    private String branch_address;
    @Column
    private String payment_forms;
    @Column
    private Integer total_items;
    @Column
    private Integer total_units;
    @Column
    private Date expiration_date;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal iva;
    @Column
    private BigDecimal total;
    @Column
    private Integer orders_num;
    @Column
    private Integer advisor_code;
    @Column
    private String observations;
    @Column
    private Integer docentry;
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
