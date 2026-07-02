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
@Table(name = "com_price_list_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceListDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(name = "id_list", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PriceList listId;

    @JoinColumn(name = "id_catproducts", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private CatProducts catproductsId;

    @JoinColumn(name = "id_product", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Products productId;
        
    @Column
    private BigDecimal sale_price;
    @Column
    private BigDecimal revenue_margin;
    @Column
    private BigDecimal revenue_percentage;
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

    public PriceList getListId() {
        return listId;
    }

    public void setListId(PriceList listId) {
        this.listId = listId;
    }

    public CatProducts getCatproductsId() {
        return catproductsId;
    }

    public void setCatproductsId(CatProducts catproductsId) {
        this.catproductsId = catproductsId;
    }

    public Products getProductId() {
        return productId;
    }

    public void setProductId(Products productId) {
        this.productId = productId;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public BigDecimal getRevenue_margin() {
        return revenue_margin;
    }

    public void setRevenue_margin(BigDecimal revenue_margin) {
        this.revenue_margin = revenue_margin;
    }

    public BigDecimal getRevenue_percentage() {
        return revenue_percentage;
    }

    public void setRevenue_percentage(BigDecimal revenue_percentage) {
        this.revenue_percentage = revenue_percentage;
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
