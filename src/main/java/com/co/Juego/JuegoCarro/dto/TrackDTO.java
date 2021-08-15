package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class TrackDTO {

    @Id
    private String idTrack;

    private Integer distance;
    private String idGame;
    private String idPodium;

}
