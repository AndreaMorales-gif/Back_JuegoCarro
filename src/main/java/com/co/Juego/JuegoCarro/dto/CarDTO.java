package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class CarDTO {
    @Id
    private String idCar;

    private String idDriver;
    private String idLane;
    private String idGame;
    private Boolean desiredDistance;
    private Integer travelDistance;
    private Integer actualPosition;

}
