package com.co.Juego.JuegoCarro.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Car {
    @Id
    private String idCar;

    private String idDriver;
    private String idLane;
    private String idGame;
    private Boolean desiredDistance;
    private Integer travelDistance;
    private Integer actualPosition;
}
