/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gen_consecutives")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consecutives {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Company companyId;
    @JoinColumn(name = "id_voucherstype", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private VouchersType voucherstypeId;
    @Column
    private String prefix;
    @Column
    private double start_num;
    @Column
    private double end_num;
    @Column
    private double current_cons;
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

    public Company getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Company companyId) {
        this.companyId = companyId;
    }

    public VouchersType getVoucherstypeId() {
        return voucherstypeId;
    }

    public void setVoucherstypeId(VouchersType voucherstypeId) {
        this.voucherstypeId = voucherstypeId;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getStart_num() {
        return start_num;
    }

    public void setStart_num(double start_num) {
        this.start_num = start_num;
    }

    public double getEnd_num() {
        return end_num;
    }

    public void setEnd_num(double end_num) {
        this.end_num = end_num;
    }

    public double getCurrent_cons() {
        return current_cons;
    }

    public void setCurrent_cons(double current_cons) {
        this.current_cons = current_cons;
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

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
