/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "conf_persons")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Persons {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Company companyId;
    @Column
    private String name;
    @Column
    private String surnames;
    @Column
    private Double identification;
    @Column
    private String type_identification;
    @JoinColumn(name = "id_city_exp", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Citys cityExpId;
    @Column
    private Date date_birth;
    @Column
    private Double phone;
    @Column
    private Double cellular;
    @Column
    private String address;
    @JoinColumn(name = "id_departments", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Departments departmentsId;
    @JoinColumn(name = "id_city", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Citys cityId;
    @Column
    private String email;
    @Column
    private char sex;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public Double getIdentification() {
        return identification;
    }

    public void setIdentification(Double identification) {
        this.identification = identification;
    }

    public String getType_identification() {
        return type_identification;
    }

    public void setType_identification(String type_identification) {
        this.type_identification = type_identification;
    }

    public Citys getCityExpId() {
        return cityExpId;
    }

    public void setCityExpId(Citys cityExpId) {
        this.cityExpId = cityExpId;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    public Double getCellular() {
        return cellular;
    }

    public void setCellular(Double cellular) {
        this.cellular = cellular;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Departments getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(Departments departmentsId) {
        this.departmentsId = departmentsId;
    }

    public Citys getCityId() {
        return cityId;
    }

    public void setCityId(Citys cityId) {
        this.cityId = cityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
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