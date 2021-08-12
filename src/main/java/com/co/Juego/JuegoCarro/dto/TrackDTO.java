package com.co.Juego.JuegoCarro.dto;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TrackDTO {

    private String idTrack;

    // @NotBlank
    private String distance;

    public TrackDTO(String idTrack, String distance) {
        this.idTrack = idTrack;
        this.distance = distance;
    }

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
