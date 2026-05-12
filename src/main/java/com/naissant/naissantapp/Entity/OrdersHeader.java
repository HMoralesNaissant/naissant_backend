/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "com_orders_header")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersHeader {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Advisors advisorId;
    @JoinColumn(name = "id_winerie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Wineries winerieId;
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Customers customerId;
    @JoinColumn(name = "id_order_status", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private OrderStatus orderStatusId;
    @JoinColumn(name = "id_payment_form", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PaymentForms paymentFormId;
    @Column
    private String order_prefix;
    @Column
    private Double consecutive;
    @Column
    private Double quantity_units;
    @Column
    private BigDecimal subtotal;
    @Column
    private BigDecimal porcentage_iva;
    @Column
    private BigDecimal vr_iva;
    @Column
    private BigDecimal total;
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

    public Advisors getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Advisors advisorId) {
        this.advisorId = advisorId;
    }

    public Wineries getWinerieId() {
        return winerieId;
    }

    public void setWinerieId(Wineries winerieId) {
        this.winerieId = winerieId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public OrderStatus getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(OrderStatus orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public PaymentForms getPaymentFormId() {
        return paymentFormId;
    }

    public void setPaymentFormId(PaymentForms paymentFormId) {
        this.paymentFormId = paymentFormId;
    }

    public String getOrder_prefix() {
        return order_prefix;
    }

    public void setOrder_prefix(String order_prefix) {
        this.order_prefix = order_prefix;
    }

    public Double getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(Double consecutive) {
        this.consecutive = consecutive;
    }

    public Double getQuantity_units() {
        return quantity_units;
    }

    public void setQuantity_units(Double quantity_units) {
        this.quantity_units = quantity_units;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getPorcentage_iva() {
        return porcentage_iva;
    }

    public void setPorcentage_iva(BigDecimal porcentage_iva) {
        this.porcentage_iva = porcentage_iva;
    }

    public BigDecimal getVr_iva() {
        return vr_iva;
    }

    public void setVr_iva(BigDecimal vr_iva) {
        this.vr_iva = vr_iva;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
