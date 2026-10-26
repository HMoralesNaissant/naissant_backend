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
@Table(name = "com_products")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Products implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_cat_products", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatProducts catProductsId;
    @Column
    private String description;
    @Column
    private String code;
    @Column(name = "bar_code")
    @JsonProperty("bar_code")
    private String barCode;
    @Column(columnDefinition = "text")
    private String content;
    @Column
    private String benefits;
    @JoinColumn(name = "id_presentation", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UndMeasures presentationId;
    @Column(name = "quantity_pres")
    @JsonProperty("quantity_pres")
    private Double quantityPres;
    @JoinColumn(name = "id_und_measures", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UndMeasures undMeasuresId;
    @Column(name = "stock_min")
    @JsonProperty("stock_min")
    private Double stockMin;
    @Column(name = "stock_max")
    @JsonProperty("stock_max")
    private Double stockMax;
    @Column(name = "price_cost")
    @JsonProperty("price_cost")
    private BigDecimal priceCost;
    @Column
    private char kit;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
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
