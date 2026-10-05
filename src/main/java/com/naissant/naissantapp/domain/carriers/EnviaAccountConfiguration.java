package com.naissant.naissantapp.domain.carriers;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAlias;

@Getter
@Setter
public class EnviaAccountConfiguration {

    @JsonAlias("cod_regional_cta")
    private Integer codRegionalCta;

    @JsonAlias("cod_oficina_cta")
    private Integer codOficinaCta;
}
