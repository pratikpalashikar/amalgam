package com.music.app.controller;

import com.music.app.model.MetaDataTable;
import com.music.app.model.MetaDataTableID;
import com.music.app.services.MusicRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicController {



    @Autowired
    private MusicRetriever musicRetriever;

    @RequestMapping("/getsongslist")
    public List<MetaDataTableID> getSongList(){

        return musicRetriever.getSongsList();

    }



    @RequestMapping(value = "/uploadsong", method = RequestMethod.POST )
    public MetaDataTableID uploadSong(@RequestBody MetaDataTable metaDataTable){
        return musicRetriever.uploadSong(metaDataTable);
    }



}
