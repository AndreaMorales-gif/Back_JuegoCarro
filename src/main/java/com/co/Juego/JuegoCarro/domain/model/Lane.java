package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.GameState;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.lane.ActualPosition;
import com.co.Juego.JuegoCarro.domain.values.lane.FinalDisplacement;
import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Lane {

    @Id
    private IdLane idLane;

    private IdCar idCar;
    private IdPlayer idPlayer;
    private IdTrack idTrack;
    private ActualPosition actualPosition;
    private FinalDisplacement finalDisplacement;

    public IdLane getIdLane() {
        return idLane;
    }

    public void setIdLane(IdLane idLane) {
        this.idLane = idLane;
    }

    public IdCar getIdCar() {
        return idCar;
    }

    public void setIdCar(IdCar idCar) {
        this.idCar = idCar;
    }

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(IdPlayer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public IdTrack getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(IdTrack idTrack) {
        this.idTrack = idTrack;
    }

    public ActualPosition getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(ActualPosition actualPosition) {
        this.actualPosition = actualPosition;
    }

    public FinalDisplacement getFinalDisplacement() {
        return finalDisplacement;
    }

    public void setFinalDisplacement(FinalDisplacement finalDisplacement) {
        this.finalDisplacement = finalDisplacement;
    }
}
