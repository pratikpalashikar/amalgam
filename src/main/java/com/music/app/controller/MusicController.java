package com.music.app.controller;

import com.music.app.model.MetaDataTable;
import com.music.app.model.MetaDataTableID;
import com.music.app.services.MusicRetriever;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;


@RestController
public class MusicController {



    @Autowired
    private MusicRetriever musicRetriever;

    @RequestMapping("/getsongslist")
    public List<MetaDataTableID> getSongList(){

        return musicRetriever.getSongsList();

    }

    /*
    *
    * "song_name": "Ankh Marey",
	"genre":"pop",
	"album_name":"Tere mere sapney",
	"artist_name":"Arshad warsi",
	"writer":"Anand Bakshi",
	"publisher": "T-series"
    *
    * */

    @RequestMapping(value = "/uploadsong", method = RequestMethod.POST )
    public MetaDataTableID uploadSong(
            @RequestParam("file") MultipartFile uploadfile,
            @RequestParam("song_name") String songName,
            @RequestParam("genre") String genre,
            @RequestParam("album_name") String albumName,
            @RequestParam("artist_name") String artistName,
            @RequestParam("writer") String writer,
            @RequestParam("publisher") String publisher
            ){


        MetaDataTable metaDataTable = new MetaDataTable();
        metaDataTable.setAlbum_name(albumName);
        metaDataTable.setArtist_name(artistName);
        metaDataTable.setGenre(genre);
        metaDataTable.setPublisher(publisher);
        metaDataTable.setSong_name(songName);
        metaDataTable.setWriter(writer);

        MetaDataTableID metaDataTableID = new MetaDataTableID();

        try {
            metaDataTableID.setData(ByteBuffer.wrap(uploadfile.getBytes()));
        }catch (IOException e){
            e.printStackTrace();

        }
        return musicRetriever.uploadSong(metaDataTable,metaDataTableID);
    }



}
