package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Track {
    //Pista

    @Id
    private IdTrack idTrack;

    private Distance distance;

}
