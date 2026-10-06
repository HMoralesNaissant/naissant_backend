/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

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
    @Column
    private String type_procedure;
    @Column
    private Date hour_visit;
    @Column
    private Date date_visit;
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

}
