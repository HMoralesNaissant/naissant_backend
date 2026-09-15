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
@Table(name = "com_invoices_header")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvoicesHeader {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public Double getInvoice() {
        return invoice;
    }

    public void setInvoice(Double invoice) {
        this.invoice = invoice;
    }

    public Date getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(Date invoice_date) {
        this.invoice_date = invoice_date;
    }

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public Double getNit() {
        return nit;
    }

    public void setNit(Double nit) {
        this.nit = nit;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    public String getPayment_forms() {
        return payment_forms;
    }

    public void setPayment_forms(String payment_forms) {
        this.payment_forms = payment_forms;
    }

    public Double getTotal_items() {
        return total_items;
    }

    public void setTotal_items(Double total_items) {
        this.total_items = total_items;
    }

    public Double getTotal_units() {
        return total_units;
    }

    public void setTotal_units(Double total_units) {
        this.total_units = total_units;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Double getOrders_num() {
        return orders_num;
    }

    public void setOrders_num(Double orders_num) {
        this.orders_num = orders_num;
    }

    public Double getAdvisor_code() {
        return advisor_code;
    }

    public void setAdvisor_code(Double advisor_code) {
        this.advisor_code = advisor_code;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
