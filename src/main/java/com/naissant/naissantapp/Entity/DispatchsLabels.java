/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "disp_dispatchs_labels")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DispatchsLabels {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_dispatch", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private DispatchsControl dispatchId;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private InvoicesHeader invoiceId;
    @JoinColumn(name = "id_conveyor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Conveyor conveyorId;
    @JoinColumn(name = "id_conveyor_acc", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private ConveyorAccounts conveyorAccId;
    @Column
    private Double boxes;
    @Column
    private BigDecimal weight_kg;
    @Column
    private BigDecimal declared_value;
    @Column
    private char chain_store;
    @JoinColumn(name = "id_origin", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Citys originId;
    @JoinColumn(name = "id_destination", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Citys destinationId;
    @Column
    private String observations;
    @Column
    private String label;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
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

    public DispatchsControl getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(DispatchsControl dispatchId) {
        this.dispatchId = dispatchId;
    }

    public InvoicesHeader getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(InvoicesHeader invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Conveyor getConveyorId() {
        return conveyorId;
    }

    public void setConveyorId(Conveyor conveyorId) {
        this.conveyorId = conveyorId;
    }

    public ConveyorAccounts getConveyorAccId() {
        return conveyorAccId;
    }

    public void setConveyorAccId(ConveyorAccounts conveyorAccId) {
        this.conveyorAccId = conveyorAccId;
    }

    public Double getBoxes() {
        return boxes;
    }

    public void setBoxes(Double boxes) {
        this.boxes = boxes;
    }

    public BigDecimal getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(BigDecimal weight_kg) {
        this.weight_kg = weight_kg;
    }

    public BigDecimal getDeclared_value() {
        return declared_value;
    }

    public void setDeclared_value(BigDecimal declared_value) {
        this.declared_value = declared_value;
    }

    public char getChain_store() {
        return chain_store;
    }

    public void setChain_store(char chain_store) {
        this.chain_store = chain_store;
    }

    public Citys getOriginId() {
        return originId;
    }

    public void setOriginId(Citys originId) {
        this.originId = originId;
    }

    public Citys getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Citys destinationId) {
        this.destinationId = destinationId;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
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
}
