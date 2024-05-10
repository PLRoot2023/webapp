package com.pg.admin.config.dynamic;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

//@Configuration
public class DbConfig {
    @Bean
    DataSource dynamicDataSource(){
        HikariDataSource dataSource =new HikariDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://192.168.25.135:5432/test_database?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("test_user");
        dataSource.setPassword("test_user");

        HikariDataSource dataSource2 =new HikariDataSource();
        dataSource2.setDriverClassName("org.postgresql.Driver");
        dataSource2.setJdbcUrl("jdbc:postgresql://192.168.25.135:5432/test_admin?useUnicode=true&characterEncoding=UTF-8");
        dataSource2.setUsername("test_admin_user");
        dataSource2.setPassword("test_admin_user");

        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        HashMap<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("1",dataSource);
        targetDataSources.put("2",dataSource2);
        dynamicDataSource.setDefaultTargetDataSource(dataSource);
        dynamicDataSource.setTargetDataSources(targetDataSources);
        return dynamicDataSource;
    }

    public static void setDataSource(String environment){
        DataSourceKeyHolder.set(environment);
    }

}
