package com.music.app.services;

import com.music.app.MockDao.MockRepository;
import com.music.app.model.MusicMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicRetriever {



    @Autowired
    private MockRepository mockRepository;

    public List<MusicMetadata> getSongsList(){

        return mockRepository.returnMusicMetadata();

    }





}
