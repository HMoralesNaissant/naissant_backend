/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "disp_dispatchs_control")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DispatchsControl {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private InvoicesHeader invoiceId;
    @Column
    private char enlisted;
    @Column
    private String user_enlisted;
    @Column
    private Date date_enlisted;
    @Column
    private char verified;
    @Column
    private String user_verified;
    @Column
    private Date date_verified;
    @Column
    private char dispatched;
    @Column
    private String user_dispatched;
    @Column
    private Date date_dispatched;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
    @Column
    private char status;
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

    public InvoicesHeader getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(InvoicesHeader invoiceId) {
        this.invoiceId = invoiceId;
    }

    public char getEnlisted() {
        return enlisted;
    }

    public void setEnlisted(char enlisted) {
        this.enlisted = enlisted;
    }

    public String getUser_enlisted() {
        return user_enlisted;
    }

    public void setUser_enlisted(String user_enlisted) {
        this.user_enlisted = user_enlisted;
    }

    public Date getDate_enlisted() {
        return date_enlisted;
    }

    public void setDate_enlisted(Date date_enlisted) {
        this.date_enlisted = date_enlisted;
    }

    public char getVerified() {
        return verified;
    }

    public void setVerified(char verified) {
        this.verified = verified;
    }

    public String getUser_verified() {
        return user_verified;
    }

    public void setUser_verified(String user_verified) {
        this.user_verified = user_verified;
    }

    public Date getDate_verified() {
        return date_verified;
    }

    public void setDate_verified(Date date_verified) {
        this.date_verified = date_verified;
    }

    public char getDispatched() {
        return dispatched;
    }

    public void setDispatched(char dispatched) {
        this.dispatched = dispatched;
    }

    public String getUser_dispatched() {
        return user_dispatched;
    }

    public void setUser_dispatched(String user_dispatched) {
        this.user_dispatched = user_dispatched;
    }

    public Date getDate_dispatched() {
        return date_dispatched;
    }

    public void setDate_dispatched(Date date_dispatched) {
        this.date_dispatched = date_dispatched;
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
