/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "ghum_severance_fund")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class SeveranceFund implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company companyId;
    @Column
    private String description;
    @Column
    private String nit;
    @Column
    private String code;
    @Column(name = "attention_line")
    @JsonProperty("attention_line")
    private Double attentionLine;
    @Column(name = "web_site")
    @JsonProperty("web_site")
    private String webSite;
    @Column
    private String adviser;
    @Column
    private Double cellular;
    @Column
    private String email;
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
