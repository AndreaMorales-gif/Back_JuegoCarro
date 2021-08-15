package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.driver.ThrowDice;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
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
public class Driver {

    @Id
    private String idDriver;

    private Integer driverPosition;
    private String idLane;
    private String idCar;
    private String idPlayer;
}
