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
@Table(name = "com_products_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductsDet {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_products", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Products productsId;
    @JoinColumn(name = "id_products_cont", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
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

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getProductsId() {
        return productsId;
    }

    public void setProductsId(Products productsId) {
        this.productsId = productsId;
    }

    public Products getProductsContId() {
        return productsContId;
    }

    public void setProductsContId(Products productsContId) {
        this.productsContId = productsContId;
    }

    public BigDecimal getQuantity_prod() {
        return quantity_prod;
    }

    public void setQuantity_prod(BigDecimal quantity_prod) {
        this.quantity_prod = quantity_prod;
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
