/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas Naissant
 * */
package com.naissant.naissantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DashboardAppApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
         SpringApplication.run(DashboardAppApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DashboardAppApplication.class);
    }

    /* En caso que tenga problema con los cors agregar este Bean */
     @Bean
    public WebMvcConfigurer corsConfigurer() 
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST","DELETE","PUT", "OPTIONS");
            }
        };
    }
}
