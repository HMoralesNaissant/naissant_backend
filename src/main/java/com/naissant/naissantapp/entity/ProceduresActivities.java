/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_procedures_activities")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class ProceduresActivities implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private String description;
    @JoinColumn(name = "type_procedure")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String typeProcedure;
    /*@Column
    private String type_procedure;*/
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

    public String getType_procedure() {
        return typeProcedure;
    }

    public void setType_procedure(String typeProcedure) {
        this.typeProcedure = typeProcedure;
    }
    /*public String getType_procedure() {
        return type_procedure;
    }

    public void setType_procedure(String type_procedure) {
        this.type_procedure = type_procedure;
    }*/
    
}
