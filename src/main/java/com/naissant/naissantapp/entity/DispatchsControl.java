/**
 * Desarrollo por: Ing. Harry Morales
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
@Table(name = "disp_dispatchs_control")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class DispatchsControl {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_invoice", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private InvoicesHeader invoiceId;
    @Column
    private char enlisted;
    @Column(name = "user_enlisted")
    @JsonProperty("user_enlisted")
    private String userEnlisted;
    @Column(name = "date_enlisted")
    @JsonProperty("date_enlisted")
    private Date dateEnlisted;
    @Column
    private char verified;
    @Column(name = "user_verified")
    @JsonProperty("user_verified")
    private String userVerified;
    @Column(name = "date_verified")
    @JsonProperty("date_verified")
    private Date dateVerified;
    @Column
    private char dispatched;
    @Column(name = "user_dispatched")
    @JsonProperty("user_dispatched")
    private String userDispatched;
    @Column(name = "date_dispatched")
    @JsonProperty("date_dispatched")
    private Date dateDispatched;
    @Column(name= "id_file", nullable = true)
    private Integer fileId;
    @Column
    private char status;
    @Column(name = "user_update")
    @JsonProperty("user_update")
    private String userUpdate;
    @Column(name = "date_update")
    @JsonProperty("date_update")
    private Date dateUpdate;

}
