package org.sillysociety.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class SimpleWebAppDatasourceConfiguration {

    @Primary
    @Bean(name="swaProperties")
//    @ConfigurationProperties("spring.datasource.swa")
    public DataSourceProperties swaProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name="swaProperties")
    @ConfigurationProperties(prefix = "spring.datasource.swa")
    public DataSource dataSource(@Qualifier("swaProperties") DataSourceProperties swaProperties) {
        return swaProperties.initializeDataSourceBuilder().build();
    }
}
