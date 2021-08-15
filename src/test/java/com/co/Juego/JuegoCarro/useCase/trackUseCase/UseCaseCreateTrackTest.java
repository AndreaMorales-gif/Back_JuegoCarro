package com.co.Juego.JuegoCarro.useCase.trackUseCase;

import com.co.Juego.JuegoCarro.domain.model.Track;
import com.co.Juego.JuegoCarro.dto.TrackDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryTrack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseCreateTrackTest {

    @SpyBean
    UseCaseCreateTrack useCaseCreateTrack;

    @MockBean
    RepositoryTrack repositoryTrack;

    @Test
    void createTrack(){
        var trackDTO = new TrackDTO("9",200 ,"4","5");
        var track = new Track();
        track.setIdTrack("9");
        track.setDistance(200);
        track.setIdGame("4");
        track.setIdPodium("5");


        when(repositoryTrack.save(Mockito.any(Track.class))).thenReturn(Mono.just(track));

        var response = useCaseCreateTrack.createTrack(trackDTO);

        Assertions.assertEquals(response.block(), trackDTO);
    }

}