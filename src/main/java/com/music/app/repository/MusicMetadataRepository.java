package com.music.app.repository;

import com.music.app.model.MetaDataTable;
import com.music.app.model.MetaDataTableID;
import com.music.app.model.MusicMetadata;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicMetadataRepository extends CassandraRepository<MetaDataTableID, Long> {




}

