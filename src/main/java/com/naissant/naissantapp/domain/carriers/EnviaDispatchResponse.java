package com.naissant.naissantapp.domain.carriers;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class EnviaDispatchResponse implements CarrierOrderResponse {

    @JsonProperty("respuesta")
    private String respuesta;
    @JsonProperty("k_cobrados")
    private BigDecimal kCobrados;
    @JsonProperty("valor_flete")
    private BigDecimal valorFlete;
    @JsonProperty("valor_costom")
    private BigDecimal valorCostoM;
    @JsonProperty("valor_otros")
    private BigDecimal valorOtros;
    @JsonProperty("dias_entrega")
    private Integer diasEntrega;
    @JsonProperty("guia")
    private String guia;
    @JsonProperty("urlguia")
    private String urlGuia;
    @JsonProperty("num_ordens")
    private String numOrdens;
    @JsonProperty("cod_postaldestino")
    private String codPostalDestino;

    public BigDecimal getkCobrados() {
        return kCobrados;
    }

    public void setkCobrados(BigDecimal kCobrados) {
        this.kCobrados = kCobrados;
    }
}
