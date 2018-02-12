package com.boorilaz.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("com.boorilaz.repositories")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.boorilaz")
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource (){
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(env.getRequiredProperty("db.url"));
        bds.setDriverClassName(env.getRequiredProperty("db.driver"));
        bds.setUsername(env.getRequiredProperty("db.usermane"));
        bds.setPassword(env.getRequiredProperty("db.password"));

        return null;
    }

}
