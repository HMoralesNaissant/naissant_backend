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
    @Column
    private String code_product;
    @Column
    private String product;
    @Column
    private Double quantity;
    @Column
    private BigDecimal unit_price;
    @Column
    private BigDecimal total;
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
