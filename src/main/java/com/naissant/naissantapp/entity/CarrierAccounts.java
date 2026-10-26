/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "disp_carrier_accounts")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class CarrierAccounts implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_carrier", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Carrier carrierId;
    @Column
    private String description;
    @Column
    private Integer accounts;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "accounts_configuration", columnDefinition = "jsonb")
    private Object accountsConfiguration;
    @Column
    private char collection;
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
