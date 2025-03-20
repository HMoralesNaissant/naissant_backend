/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naissant.naissantapp.Config;

/**
 *
 * @author hmorales
 */

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
