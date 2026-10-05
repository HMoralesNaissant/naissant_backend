package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "disp_dispatch_labels_response")
@JsonInclude(JsonInclude.Include.NON_NULL)
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

    @Type(type = "com.vladmihalcea.hibernate.type.json.JsonType")
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDispatchLabelId() {
        return dispatchLabelId;
    }

    public void setDispatchLabelId(Integer dispatchLabelId) {
        this.dispatchLabelId = dispatchLabelId;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(String userCreate) {
        this.userCreate = userCreate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Float getInvoice() {
        return invoice;
    }

    public void setInvoice(Float invoice) {
        this.invoice = invoice;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
