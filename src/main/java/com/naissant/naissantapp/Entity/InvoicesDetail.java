/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "com_invoices_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoicesDetail {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InvoicesHeader getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(InvoicesHeader invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCode_product() {
        return code_product;
    }

    public void setCode_product(String code_product) {
        this.code_product = code_product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Double getDocentry() {
        return docentry;
    }

    public void setDocentry(Double docentry) {
        this.docentry = docentry;
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
