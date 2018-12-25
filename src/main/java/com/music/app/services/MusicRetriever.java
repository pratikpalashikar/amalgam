package com.music.app.services;

import com.music.app.model.MetaDataTable;
import com.music.app.model.MetaDataTableID;
import com.music.app.repository.MusicMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MusicRetriever {



    @Autowired
    private MusicMetadataRepository musicMetadataRepository;

    public List<MetaDataTableID> getSongsList(){

        return musicMetadataRepository.findAll();

    }


    public MetaDataTableID uploadSong(MetaDataTable metaDataTable) {
        MetaDataTableID metaDataTableID = new MetaDataTableID();
        metaDataTableID.setData(null);
        metaDataTableID.setId(UUID.randomUUID());
        metaDataTableID.setMetadata(metaDataTable);
        return musicMetadataRepository.save(metaDataTableID);
    }
}
