/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardAppApplication {

    public static void main(String[] args) {
         SpringApplication.run(DashboardAppApplication.class, args);
    }
//
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(DashboardAppApplication.class);
//    }
//
//    /* En caso que tenga problema con los cors agregar este Bean */
//     @Bean
//    public WebMvcConfigurer corsConfigurer() 
//    {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST","DELETE","PUT", "OPTIONS");
//            }
//        };
//    }
}
