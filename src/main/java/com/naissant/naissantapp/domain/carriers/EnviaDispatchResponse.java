package com.naissant.naissantapp.domain.carriers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
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

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public BigDecimal getkCobrados() {
        return kCobrados;
    }

    public void setkCobrados(BigDecimal kCobrados) {
        this.kCobrados = kCobrados;
    }

    public BigDecimal getValorFlete() {
        return valorFlete;
    }

    public void setValorFlete(BigDecimal valorFlete) {
        this.valorFlete = valorFlete;
    }

    public BigDecimal getValorCostoM() {
        return valorCostoM;
    }

    public void setValorCostoM(BigDecimal valorCostoM) {
        this.valorCostoM = valorCostoM;
    }

    public BigDecimal getValorOtros() {
        return valorOtros;
    }

    public void setValorOtros(BigDecimal valorOtros) {
        this.valorOtros = valorOtros;
    }

    public Integer getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(Integer diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getUrlGuia() {
        return urlGuia;
    }

    public void setUrlGuia(String urlGuia) {
        this.urlGuia = urlGuia;
    }

    public String getNumOrdens() {
        return numOrdens;
    }

    public void setNumOrdens(String numOrdens) {
        this.numOrdens = numOrdens;
    }

    public String getCodPostalDestino() {
        return codPostalDestino;
    }

    public void setCodPostalDestino(String codPostalDestino) {
        this.codPostalDestino = codPostalDestino;
    }
}
