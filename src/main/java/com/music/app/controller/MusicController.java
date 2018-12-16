package com.music.app.controller;

import com.music.app.model.MusicMetadata;
import com.music.app.services.MusicRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {



    @Autowired
    private MusicRetriever musicRetriever;

    @RequestMapping("/getSongList")
    public List<MusicMetadata> getSongList(){

        return musicRetriever.getSongsList();

    }



}
