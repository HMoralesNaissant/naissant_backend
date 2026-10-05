package com.naissant.naissantapp.domain.carriers;

import com.fasterxml.jackson.annotation.JsonAlias;

public class EnviaAccountConfiguration {

    @JsonAlias("cod_regional_cta")
    private Integer codRegionalCta;

    @JsonAlias("cod_oficina_cta")
    private Integer codOficinaCta;

    public Integer getCodRegionalCta() {
        return codRegionalCta;
    }

    public void setCodRegionalCta(Integer codRegionalCta) {
        this.codRegionalCta = codRegionalCta;
    }

    public Integer getCodOficinaCta() {
        return codOficinaCta;
    }

    public void setCodOficinaCta(Integer codOficinaCta) {
        this.codOficinaCta = codOficinaCta;
    }
}
