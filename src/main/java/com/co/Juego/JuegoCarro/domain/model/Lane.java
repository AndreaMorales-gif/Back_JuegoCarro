package com.co.Juego.JuegoCarro.domain.model;

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
public class Lane {

    @Id
    private String idLane;

    private String idCar;
    private String idDriver;
    private String idTrack;
    private String idGame;


}
