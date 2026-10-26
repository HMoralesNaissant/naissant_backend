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
@Table(name = "com_price_list_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class PriceListDet implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(name = "id_list", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PriceList listId;

    @JoinColumn(name = "id_catproducts", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatProducts catproductsId;

    @JoinColumn(name = "id_product", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Products productId;
        
    @Column(name = "sale_price")
    @JsonProperty("sale_price")
    private BigDecimal salePrice;
    @Column(name = "revenue_margin")
    @JsonProperty("revenue_margin")
    private BigDecimal revenueMargin;
    @Column(name = "revenue_percentage")
    @JsonProperty("revenue_percentage")
    private BigDecimal revenuePercentage;
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
