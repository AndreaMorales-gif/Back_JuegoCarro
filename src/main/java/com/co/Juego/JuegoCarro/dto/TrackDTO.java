package com.co.Juego.JuegoCarro.dto;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TrackDTO {

    private String idTrack;

    // @NotBlank
    private String distance;
}
