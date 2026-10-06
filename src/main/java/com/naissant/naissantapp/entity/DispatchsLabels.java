/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

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
    @Column
    private BigDecimal weight_kg;
    @Column
    private BigDecimal declared_value;
    @Column
    private char chain_store;
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
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

}
