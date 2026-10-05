package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "disp_dispatch_labels_response")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class DispatchLabelsResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dispatchLabelsResponseSequence")
    @SequenceGenerator(
            name = "dispatchLabelsResponseSequence",
            sequenceName = "disp_response_labels_id_seq",
            allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "id_dispatch_label")
    private Integer dispatchLabelId;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "response", columnDefinition = "jsonb")
    private Object response;

    @Column(name = "id_carrier")
    private Integer carrierId;

    @Column(name = "label", length = 15)
    private String label;

    @Column(name = "status", columnDefinition = "bpchar(1)")
    private String status;

    @Column(name = "user_create", length = 15)
    private String userCreate;

    @Column(name = "date_create")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;

    @Column(name = "invoice")
    private Float invoice;

    @Column(name = "customer_code", length = 20)
    private String customerCode;

    @Column(name = "destination", length = 30)
    private String destination;

    public DispatchLabelsResponse() {
    }
}
