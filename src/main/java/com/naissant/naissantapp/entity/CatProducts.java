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
@Table(name = "com_cat_products")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class CatProducts implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
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
