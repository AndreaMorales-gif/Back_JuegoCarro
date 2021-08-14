package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.car.ArrivalGoal;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
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
    private Boolean desiredDistance; //distancia deseada
    private Integer travelDistance; //distancia recorrida
    private Integer actualPosition;
}
