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
@Table(name = "com_orders_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class OrdersDetail implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_order_header", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OrdersHeader orderHeaderId;
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Products productId;
    @Column
    private Double quantity;
    @Column(name = "unit_price")
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;
    @Column(name = "total_price")
    @JsonProperty("total_price")
    private BigDecimal totalPrice;
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
