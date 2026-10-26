/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class OrdersHeader implements Auditable {
    
    
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
    @Column(name = "order_prefix")
    @JsonProperty("order_prefix")
    private String orderPrefix;
    @Column
    private Double consecutive;
    @Column(name = "quantity_units")
    @JsonProperty("quantity_units")
    private Double quantityUnits;
    @Column
    private BigDecimal subtotal;
    @Column(name = "porcentage_iva")
    @JsonProperty("porcentage_iva")
    private BigDecimal porcentageIva;
    @Column(name = "vr_iva")
    @JsonProperty("vr_iva")
    private BigDecimal vrIva;
    @Column
    private BigDecimal total;
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
