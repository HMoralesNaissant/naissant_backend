/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_products_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ProductsDet implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_products", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Products productsId;
    @JoinColumn(name = "id_products_cont", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Products productsContId;
    @Column
    private BigDecimal quantity_prod;
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
