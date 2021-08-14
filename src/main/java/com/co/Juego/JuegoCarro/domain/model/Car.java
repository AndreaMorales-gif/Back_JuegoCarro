package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.car.ArrivalGoal;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Car {
    @Id
    private IdCar idCar;

    private IdDriver idDriver;
    private ArrivalGoal arrivalGoal;
    private IdLane idLane;

}
