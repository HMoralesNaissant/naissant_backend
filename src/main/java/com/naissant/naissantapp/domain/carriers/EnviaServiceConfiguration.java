package com.naissant.naissantapp.domain.carriers;

import com.fasterxml.jackson.annotation.JsonAlias;

public class EnviaServiceConfiguration {

    @JsonAlias({"webapi.generation_url", "url"})
    private String generationUrl;
    @JsonAlias("webapi.user")
    private String username;
    @JsonAlias("webapi.password")
    private String password;

    public String getGenerationUrl() {
        return generationUrl;
    }

    public void setGenerationUrl(String generationUrl) {
        this.generationUrl = generationUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
