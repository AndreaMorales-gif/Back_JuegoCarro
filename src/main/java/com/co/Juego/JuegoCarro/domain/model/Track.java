package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Track {
    //Pista

    @Id
    private IdTrack idTrack;

    private Distance distance;

    public IdTrack getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(IdTrack idTrack) {
        this.idTrack = idTrack;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }
}
