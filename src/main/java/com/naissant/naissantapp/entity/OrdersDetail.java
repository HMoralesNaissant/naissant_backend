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
@Table(name = "com_orders_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class OrdersDetail {
    
    
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
    @Column
    private BigDecimal unit_price;
    @Column
    private BigDecimal total_price;
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
