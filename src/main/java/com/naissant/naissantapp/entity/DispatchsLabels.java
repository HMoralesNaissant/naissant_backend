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
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "disp_dispatchs_labels")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class DispatchsLabels implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_dispatch", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DispatchsControl dispatchId;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private InvoicesHeader invoiceId;
    @JoinColumn(name = "id_carrier", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Carrier carrierId;
    @JoinColumn(name = "id_carrier_acc", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CarrierAccounts carrierAccId;
    @Column
    private Integer boxes;
    @Column(name = "weight_kg")
    @JsonProperty("weight_kg")
    private BigDecimal weightKg;
    @Column(name = "declared_value")
    @JsonProperty("declared_value")
    private BigDecimal declaredValue;
    @Column(name = "chain_store")
    @JsonProperty("chain_store")
    private char chainStore;
    @JoinColumn(name = "id_origin", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys originId;
    @JoinColumn(name = "id_destination", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Citys destinationId;
    @Column
    private String observations;
    @Column
    private String label;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "additional_info", columnDefinition = "jsonb")
    private Object additionalInfo;
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
