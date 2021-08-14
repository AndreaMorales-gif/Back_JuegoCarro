package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.driver.ThrowDice;
import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Driver {

    @Id
    private IdDriver idDriver;

    private ThrowDice throwDice;
    private IdPlayer idPlayer;


}
