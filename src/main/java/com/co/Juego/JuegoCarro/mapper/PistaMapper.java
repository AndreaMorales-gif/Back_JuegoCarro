package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Track;
import com.co.Juego.JuegoCarro.dto.TrackDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class PistaMapper {
    public Function<TrackDTO, Track> mapperToTrack(String id){
        return  updateTrack -> {
            Track track = new Track();
            track.setIdTrack(id);
            track.setDistance(updateTrack.getDistance());
            track.setIdGame(updateTrack.getIdGame());
            track.setIdPodium(updateTrack.getIdPodium());
            return track;
        };
    }

    public Function<Track,TrackDTO> mapperToTrackDTO(){
        return track -> new TrackDTO(
                track.getIdTrack(),
                track.getDistance(),
                track.getIdGame(),
                track.getIdPodium()
        );
    }
}
