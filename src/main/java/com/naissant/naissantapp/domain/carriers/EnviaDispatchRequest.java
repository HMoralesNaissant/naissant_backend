package com.naissant.naissantapp.domain.carriers;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class EnviaDispatchRequest {

    @JsonProperty("ciudad_origen")
    private String ciudadOrigen;
    @JsonProperty("ciudad_destino")
    private String ciudadDestino;
    @JsonProperty("cod_formapago")
    private Integer codFormaPago;
    @JsonProperty("cod_servicio")
    private Integer codServicio;
    @JsonProperty("num_unidades")
    private Integer numUnidades;
    @JsonProperty("mpesoreal_k")
    private BigDecimal mpesoRealK;
    @JsonProperty("mpesovolumen_k")
    private BigDecimal mpesoVolumenK;
    @JsonProperty("valor_declarado")
    private BigDecimal valorDeclarado;
    @JsonProperty("mca_nosabado")
    private Integer mcaNoSabado;
    @JsonProperty("mca_docinternacional")
    private Integer mcaDocInternacional;
    @JsonProperty("cod_regional_cta")
    private Integer codRegionalCta;
    @JsonProperty("cod_oficina_cta")
    private Integer codOficinaCta;
    @JsonProperty("cod_cuenta")
    private Integer codCuenta;
    @JsonProperty("con_cartaporte")
    private String conCartaporte;
    @JsonProperty("info_origen")
    private OriginInfo infoOrigen;
    @JsonProperty("info_destino")
    private DestinationInfo infoDestino;
    @JsonProperty("info_contenido")
    private ContentInfo infoContenido;
    @JsonProperty("numero_guia")
    private String numeroGuia;
    @JsonProperty("generar_os")
    private String generarOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    public static class OriginInfo {

        @JsonProperty("nom_remitente")
        private String nomRemitente;
        @JsonProperty("dir_remitente")
        private String dirRemitente;
        @JsonProperty("tel_remitente")
        private String telRemitente;
        @JsonProperty("ced_remitente")
        private String cedRemitente;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    public static class DestinationInfo {

        @JsonProperty("nom_destinatario")
        private String nomDestinatario;
        @JsonProperty("dir_destinatario")
        private String dirDestinatario;
        @JsonProperty("tel_destinatario")
        private String telDestinatario;
        @JsonProperty("ced_destinatario")
        private String cedDestinatario;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    public static class ContentInfo {

        @JsonProperty("dice_contener")
        private String diceContener;
        @JsonProperty("texto_guia")
        private String textoGuia;
        @JsonProperty("accion_notaguia")
        private String accionNotaGuia;
        @JsonProperty("num_documentos")
        private String numDocumentos;
        @JsonProperty("centrocosto")
        private String centroCosto;
        @JsonProperty("valorproducto")
        private String valorProducto;
    }
}
