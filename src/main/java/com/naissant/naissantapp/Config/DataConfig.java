/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas Naissant
 * */

package com.naissant.naissantapp.Config;

import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.naissant.naissantapp.Entity")
@EnableJpaRepositories(basePackages = {
    "com.naissant.naissantapp.Repository"
},
        transactionManagerRef = "naissantTransactionManager"
)
public class DataConfig {

    @Bean
    public PlatformTransactionManager naissantTransactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        transactionManager.setValidateExistingTransaction(true);
        return transactionManager;
    }

}
