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
    @Column
    private String bar_code;
    @Column(columnDefinition = "text")
    private String content;
    @Column
    private String benefits;
    @JoinColumn(name = "id_presentation", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UndMeasures presentationId;
    @Column
    private Double quantity_pres;
    @JoinColumn(name = "id_und_measures", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private UndMeasures undMeasuresId;
    @Column
    private Double stock_min;
    @Column
    private Double stock_max;
    @Column
    private BigDecimal price_cost;
    @Column
    private char kit;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
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
