package com.co.Juego.JuegoCarro.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class LaneDTO {
    private String idLane;
    // @NotBlank
    private String idCar;
    private String idPlayer;
    private String idTrack;
    private String actualPosition;
    private boolean finalDisplacement;

}
