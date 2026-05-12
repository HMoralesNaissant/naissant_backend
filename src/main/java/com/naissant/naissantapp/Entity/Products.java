/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "com_products")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_cat_products", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatProducts catProductsId;
    @Column
    private String description;
    @Column
    private String code;
    @Column
    private String bar_code;
    @Column
    private String content;
    @Column
    private String benefits;
    @JoinColumn(name = "id_presentation", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private UndMeasures presentationId;
    @Column
    private Double quantity_pres;
    @JoinColumn(name = "id_und_measures", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CatProducts getCatProductsId() {
        return catProductsId;
    }

    public void setCatProductsId(CatProducts catProductsId) {
        this.catProductsId = catProductsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public UndMeasures getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(UndMeasures presentationId) {
        this.presentationId = presentationId;
    }

    public Double getQuantity_pres() {
        return quantity_pres;
    }

    public void setQuantity_pres(Double quantity_pres) {
        this.quantity_pres = quantity_pres;
    }

    public UndMeasures getUndMeasuresId() {
        return undMeasuresId;
    }

    public void setUndmeasuresId(UndMeasures undMeasuresId) {
        this.undMeasuresId = undMeasuresId;
    }

    public Double getStock_min() {
        return stock_min;
    }

    public void setStock_min(Double stock_min) {
        this.stock_min = stock_min;
    }

    public Double getStock_max() {
        return stock_max;
    }

    public void setStock_max(Double stock_max) {
        this.stock_max = stock_max;
    }

    public BigDecimal getPrice_cost() {
        return price_cost;
    }

    public void setPrice_cost(BigDecimal price_cost) {
        this.price_cost = price_cost;
    }

    public char getKit() {
        return kit;
    }

    public void setKit(char kit) {
        this.kit = kit;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
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
