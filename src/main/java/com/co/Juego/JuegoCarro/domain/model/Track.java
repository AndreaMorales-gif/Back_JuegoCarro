package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Track {

    @Id
    private String idTrack;

    private Integer distance;
    private String idGame;
    private String idPodium;

}
