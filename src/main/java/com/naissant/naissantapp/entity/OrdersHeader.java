/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_orders_header")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class OrdersHeader {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Advisors advisorId;
    @JoinColumn(name = "id_winerie", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Wineries winerieId;
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customers customerId;
    @JoinColumn(name = "id_order_status", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderStatus orderStatusId;
    @JoinColumn(name = "id_payment_form", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
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
    
    
}
