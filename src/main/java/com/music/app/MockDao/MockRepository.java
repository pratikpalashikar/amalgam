package com.music.app.MockDao;

import com.music.app.model.MusicMetadata;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockRepository {


    public List<MusicMetadata> returnMusicMetadata(){


        MusicMetadata musicMetadata = new MusicMetadata().build();
        MusicMetadata musicMetadata1 = new MusicMetadata().build().withAlbumName("Simba");
        MusicMetadata musicMetadata2 = new MusicMetadata().build().withAlbumName("Dosti").withArtist("Dimple");

        List<MusicMetadata> list = new ArrayList<>();
        list.add(musicMetadata);
        list.add(musicMetadata1);
        list.add(musicMetadata2);


        return list;

    }


}
