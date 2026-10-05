package com.naissant.naissantapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.datatype.hibernate7.Hibernate7Module;

@Configuration
public class JacksonConfig {

    /**
     * Associations are LAZY. Serializing an entity must not initialize them,
     * otherwise the whole entity graph gets loaded again (N+1 queries).
     * Uninitialized associations are written as {"id": <fk>} instead.
     */
    @Bean
    public Hibernate7Module hibernate7Module() {
        return new Hibernate7Module()
                .enable(Hibernate7Module.Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);
    }
}
