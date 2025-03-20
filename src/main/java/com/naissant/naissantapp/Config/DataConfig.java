/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas Naissant
 **/

package com.naissant.naissantapp.Config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.naissant.naissantapp.Entity")
@EnableJpaRepositories(basePackages = {
    "com.naissant.naissantapp.Repository"
},
        entityManagerFactoryRef = "naissantEntityManager",
        transactionManagerRef = "naissantTransactionManager"
)
public class DataConfig {

    /**
     * Data source class name.
     */
    @Value("${spring.datasource.username}")
    private String username;

    /**
     * Data source URL.
     */
    @Value("${spring.datasource.password}")
    private String password;

    /**
     * Data source class name.
     */
    @Value("${spring.datasource.driver-class-name}")
    private String className;

    /**
     * Data source URL.
     */
    @Value("${spring.datasource.url}")
    private String url;

    /**
     * Hibernate show sql.
     */
    @Value("${spring.hibernate.show-sql}")
    private String showSql;

    /**
     * Format sql.
     */
    @Value("${spring.hibernate.format_sql}")
    private String formatSql;

    /**
     * Hikari maximum pool size.
     */
    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private int hikariMaxPoolSize;

    /**
     * Hikari minimum idle.
     */
    @Value("${spring.datasource.hikari.minimum-idle}")
    private int hikariMinIdle;

    /**
     * Hikari connection timeout.
     */
    @Value("${spring.datasource.hikari.connection-timeout}")
    private int hikariConnectionTimeOut;

    /**
     * Hikari idle timeout.
     */
    @Value("${spring.datasource.hikari.idle-timeout}")
    private int hikariIdleTimeout;

    @Bean
    public LocalContainerEntityManagerFactoryBean naissantEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("com.naissant.naissantapp.Entity");
        em.setPersistenceUnitName("NaissantPU");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter((JpaVendorAdapter) vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.temp.use_jdbc_metadata_defaults", Boolean.valueOf(false));
        properties.put("hibernate.show_sql", this.showSql);
        properties.put("hibernate.format_sql", this.formatSql);
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(this.className);
        dataSource.setUrl(this.url);
        dataSource.setUsername(this.username);
        dataSource.setPassword(this.password);
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDataSource((DataSource) dataSource);
        hikariConfig.setMaximumPoolSize(this.hikariMaxPoolSize);
        hikariConfig.setMinimumIdle(this.hikariMinIdle);
        hikariConfig.setConnectionTimeout(this.hikariConnectionTimeOut);
        hikariConfig.setIdleTimeout(this.hikariIdleTimeout);
        return new HikariDataSource(hikariConfig);
    }

    @Bean
    public PlatformTransactionManager naissantTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(naissantEntityManager().getObject());
        transactionManager.setValidateExistingTransaction(true);
        return transactionManager;
    }

}
