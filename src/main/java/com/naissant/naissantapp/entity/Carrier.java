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
import java.util.Date;

@Entity
@Table(name = "disp_carrier")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class Carrier implements Auditable {
    
    
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
    @Column(name = "web_site")
    @JsonProperty("web_site")
    private String webSite;
    @Column
    private String adviser;
    @Column
    private Double cellular;
    @Column
    private String email;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "carrier_configuration", columnDefinition = "jsonb")
    private Object carrierConfiguration;
    @Column(name = "id_photo_file", nullable = true)
    private Integer photoFileId;
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
