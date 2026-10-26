/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ghum_disabilities")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Disabilities implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_employee", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employees employeeId;
    @Column
    private String entity;
    @Column(name = "start_date")
    @JsonProperty("start_date")
    private Date startDate;
    @Column(name = "end_date")
    @JsonProperty("end_date")
    private Date endDate;
    @Column
    private char filed;
    @Column(name = "payment_status")
    @JsonProperty("payment_status")
    private String paymentStatus;
    @Column
    private String observations;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
    @Column
    private char status;
    @Column(name = "user_create")
    @JsonProperty("user_create")
    private String userCreate;
    @Column(name = "date_create")
    @JsonProperty("date_create")
    private Date dateCreate;
    @Column(name = "user_update")
    @JsonProperty("user_update")
    private String userUpdate;
    @Column(name = "date_update")
    @JsonProperty("date_update")
    private Date dateUpdate;

    

    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
