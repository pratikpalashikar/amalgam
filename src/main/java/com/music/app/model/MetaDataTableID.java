package com.music.app.model;

import com.datastax.driver.core.DataType;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("songs")
public class MetaDataTableID {



    @PrimaryKeyColumn(ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private UUID id;

    @Column
    private byte[] data;

    @CassandraType(type = DataType.Name.UDT, userTypeName = "metadata")
    @Column
    private MetaDataTable metadata;





    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


    public MetaDataTable getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaDataTable metadata) {
        this.metadata = metadata;
    }
}
