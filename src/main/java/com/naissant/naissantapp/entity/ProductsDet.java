/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
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
    @Column(name = "quantity_prod")
    @JsonProperty("quantity_prod")
    private BigDecimal quantityProd;
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
