/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "inv_investigadores")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Investigadores {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_persona", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Personas personaId;
    @Column
    private char tipo_investigador;
    @Column
    private String id_programa;
    @JoinColumn(name = "id_estudio", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private NivelEstudios estudiosId;
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

    public Personas getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Personas personaId) {
        this.personaId = personaId;
    }

    public char getTipo_investigador() {
        return tipo_investigador;
    }

    public void setTipo_investigador(char tipo_investigador) {
        this.tipo_investigador = tipo_investigador;
    }

    public String getId_programa() {
        return id_programa;
    }

    public void setId_programa(String id_programa) {
        this.id_programa = id_programa;
    }
    
    public NivelEstudios getEstudiosId() {
        return estudiosId;
    }

    public void setEstudiosId(NivelEstudios estudiosId) {
        this.estudiosId = estudiosId;
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
