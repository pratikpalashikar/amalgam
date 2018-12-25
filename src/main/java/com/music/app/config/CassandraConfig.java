package com.music.app.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;


@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {




    @Value("${spring.data.keyspace}")
    private String keySpaceName;

    @Value("${spring.data.ip}")
    private String ip;

    @Value("${spring.data.port}")
    private int port;


    @Override
    protected String getKeyspaceName() {
        return keySpaceName;
    }


    @Bean
    public CassandraClusterFactoryBean cluster(){

       CassandraClusterFactoryBean cassandraClusterFactoryBean = new CassandraClusterFactoryBean();
       cassandraClusterFactoryBean.setContactPoints(ip);
       cassandraClusterFactoryBean.setPort(port);

       return cassandraClusterFactoryBean;

    }



    @Bean
    public CassandraMappingContext mappingContext() {
        BasicCassandraMappingContext mappingContext = new BasicCassandraMappingContext();
        mappingContext.setUserTypeResolver(new SimpleUserTypeResolver(cluster().getObject(), getKeyspaceName()));
        return mappingContext;
    }



}
