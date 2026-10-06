/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.entity;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "com_price_list_det")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class PriceListDet implements Auditable {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(name = "id_list", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PriceList listId;

    @JoinColumn(name = "id_catproducts", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CatProducts catproductsId;

    @JoinColumn(name = "id_product", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Products productId;
        
    @Column
    private BigDecimal sale_price;
    @Column
    private BigDecimal revenue_margin;
    @Column
    private BigDecimal revenue_percentage;
    @Column
    private String user_create;
    @Column
    private Date date_create;
    @Column
    private String user_update;
    @Column
    private Date date_update;

   
}
