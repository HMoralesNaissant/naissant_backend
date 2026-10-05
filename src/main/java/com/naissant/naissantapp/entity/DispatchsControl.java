/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.entity;

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

}
