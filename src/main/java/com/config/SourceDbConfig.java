package com.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@Component
class SourceDbConfig{
    @Bean("sourceDb")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

}