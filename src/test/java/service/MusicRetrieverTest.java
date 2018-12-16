package service;


import com.music.app.MockDao.MockRepository;
import com.music.app.model.MusicMetadata;
import com.music.app.services.MusicRetriever;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

@Profile(value = "ut")
@RunWith(MockitoJUnitRunner.class)
public class MusicRetrieverTest {


    @Autowired
    private MusicRetriever musicRetriever;


    @Autowired
    private MockRepository mockRepository;


    @Test
    public void getSongsListTest(){


        MusicMetadata musicMetadata = new MusicMetadata().build();
        List<MusicMetadata> musicMetadataList = new ArrayList<>();
        musicMetadataList.add(musicMetadata);

        Mockito.when(mockRepository.returnMusicMetadata()).then((Answer<?>) musicMetadataList);

        Assert.assertNotNull(musicRetriever.getSongsList());

        Mockito.verify(musicRetriever.getSongsList());

    }







}
