package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.car.IdCar;
import com.co.Juego.JuegoCarro.domain.values.game.IdGame;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.player.Name;
import com.co.Juego.JuegoCarro.domain.values.player.QuantityWinner;
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
public class Player {

    @Id
    private String idPlayer;

    private String name;
    private Integer firstPlace;
    private Integer secondPlace;
    private Integer thirdPlace;
    private String idGame;
    private String idCar;

}

