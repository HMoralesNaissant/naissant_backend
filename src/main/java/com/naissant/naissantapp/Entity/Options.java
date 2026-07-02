/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "conf_options")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Options {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_module", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Modules moduleId;
    @Column
    private String name;
    @Column
    private String route;
    @Column
    private String type;
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

    public Modules getModuleId() {
        return moduleId;
    }

    public void setModuleId(Modules moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
