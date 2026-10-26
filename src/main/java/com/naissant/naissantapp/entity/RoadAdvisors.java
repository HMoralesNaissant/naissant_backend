/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_road_advisors")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class RoadAdvisors implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_advisor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Advisors advisorId;
    @JoinColumn(name = "id_customer", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customers customerId;
    @Column(name = "type_procedure")
    @JsonProperty("type_procedure")
    private String typeProcedure;
    @Column(name = "hour_visit")
    @JsonProperty("hour_visit")
    private Date hourVisit;
    @Column(name = "date_visit")
    @JsonProperty("date_visit")
    private Date dateVisit;
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

}
