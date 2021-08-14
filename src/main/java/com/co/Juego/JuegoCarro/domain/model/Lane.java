package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.GameState;
import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.lane.ActualPosition;
import com.co.Juego.JuegoCarro.domain.values.lane.FinalDisplacement;
import com.co.Juego.JuegoCarro.domain.values.lane.IdLane;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.track.IdTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Lane {

    @Id
    private IdLane idLane;

    private IdCar idCar;
    private IdPlayer idPlayer;
    private IdTrack idTrack;
    private ActualPosition actualPosition;
    private FinalDisplacement finalDisplacement;


}
