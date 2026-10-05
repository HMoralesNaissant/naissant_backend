package com.naissant.naissantapp.domain.carriers;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonAlias;

@Getter
@Setter
public class EnviaServiceConfiguration {

    @JsonAlias({"webapi.generation_url", "url"})
    private String generationUrl;
    @JsonAlias("webapi.user")
    private String username;
    @JsonAlias("webapi.password")
    private String password;
}
