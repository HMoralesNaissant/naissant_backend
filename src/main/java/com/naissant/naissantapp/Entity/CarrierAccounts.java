/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "disp_carrier_accounts")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarrierAccounts {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_carrier", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Carrier carrierId;
    @Column
    private String description;
    @Column
    private Integer accounts;
    @Type(type = "com.vladmihalcea.hibernate.type.json.JsonBinaryType")
    @Column(name = "accounts_configuration", columnDefinition = "jsonb")
    private Object accountsConfiguration;
    @Column
    private char collection;
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

    public Carrier getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Carrier carrierId) {
        this.carrierId = carrierId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAccounts() {
        return accounts;
    }

    public void setAccounts(Integer accounts) {
        this.accounts = accounts;
    }

    public Object getAccountsConfiguration() {
        return accountsConfiguration;
    }

    public void setAccountsConfiguration(Object accountsConfiguration) {
        this.accountsConfiguration = accountsConfiguration;
    }

    public char getCollection() {
        return collection;
    }

    public void setCollection(char collection) {
        this.collection = collection;
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
