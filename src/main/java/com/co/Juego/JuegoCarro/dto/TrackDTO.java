package com.co.Juego.JuegoCarro.dto;

import com.co.Juego.JuegoCarro.domain.values.track.Distance;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class TrackDTO {

    private String idTrack;
    // @NotBlank
    private String distance;

}
