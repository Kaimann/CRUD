package com.scrud.config;

import com.scrud.dao.CarBrandDAO;
import com.scrud.dao.CarModelDAO;
import com.scrud.dao.jdbc.CarBrandDAOJdbcImpl;
import com.scrud.dao.jdbc.CarModelDAOJdbcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public CarBrandDAO getCarBrandJdbcDAO() {
        return new CarBrandDAOJdbcImpl(dataSource);
    }
    @Bean
    public CarModelDAO getCarModelJdbcDAO() {
        return new CarModelDAOJdbcImpl(dataSource);
    }
}
