package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.car.ArrivalGoal;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
    @Id
    private IdCar idCar;

    private IdDriver idDriver;
    private ArrivalGoal arrivalGoal;
    private IdLane idLane;

    public IdCar getIdCar() {
        return idCar;
    }

    public void setIdCar(IdCar idCar) {
        this.idCar = idCar;
    }

    public IdDriver getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(IdDriver idDriver) {
        this.idDriver = idDriver;
    }

    public ArrivalGoal getArrivalGoal() {
        return arrivalGoal;
    }

    public void setArrivalGoal(ArrivalGoal arrivalGoal) {
        this.arrivalGoal = arrivalGoal;
    }

    public IdLane getIdLane() {
        return idLane;
    }

    public void setIdLane(IdLane idLane) {
        this.idLane = idLane;
    }
}
