package com.itau.microserviceDataExtract;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource({ "classpath:application.properties" })
@EnableJpaRepositories(
    basePackages = "com.itau.microserviceDataExtract.az1.dao.az3", 
    entityManagerFactoryRef = "EntityManagerAz3", 
    transactionManagerRef = "userTransactionManager"
)
public class AZ3Config {
    @Autowired
    private Environment env;
     
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean EntityManagerAz3() {
        LocalContainerEntityManagerFactoryBean em
          = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(userDataSource());
        em.setPackagesToScan(
          new String[] { "com.itau.microserviceDataExtract.domain.az3" });
 
        HibernateJpaVendorAdapter vendorAdapter
          = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto",
          "none");
        properties.put("hibernate.dialect",
          env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);
 
        return em;
    }
 
    @Primary
    @Bean
    public DataSource userDataSource() {
  
        DriverManagerDataSource dataSource
          = new DriverManagerDataSource();
//        dataSource.setDriverClassName(
//          env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("az3.datasource.url"));
        dataSource.setUsername(env.getProperty("az3.datasource.username"));
        dataSource.setPassword(env.getProperty("az3.datasource.password"));
 
        return dataSource;
    }
 
    @Primary
    @Bean
    public PlatformTransactionManager userTransactionManager() {
  
        JpaTransactionManager transactionManager
          = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
          EntityManagerAz3().getObject());
        return transactionManager;
    }
}