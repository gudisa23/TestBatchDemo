package com.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
class DestinationDbConfig{
    @Bean("destinationDb")
    @ConfigurationProperties(prefix="spring.batch.datasource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }

}
