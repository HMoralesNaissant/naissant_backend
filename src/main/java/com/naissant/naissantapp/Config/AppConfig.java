/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */

package com.naissant.naissantapp.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig{

    @Autowired
    public void onStartup(ServletContext sc) throws ServletException {
    }

}
