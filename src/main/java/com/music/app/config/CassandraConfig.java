package com.music.app.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

public class CassandraConfig extends AbstractCassandraConfiguration {




    @Value("${spring.data.keyspace}")
    private String keySpaceName;

    @Value("${spring.data.ip}")
    private String ip;

    @Value("${spring.data.port}")
    private String port;


    @Override
    protected String getKeyspaceName() {
        return keySpaceName;
    }






}
