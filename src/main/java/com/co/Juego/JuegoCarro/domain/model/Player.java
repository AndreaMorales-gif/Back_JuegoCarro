package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.player.Name;
import com.co.Juego.JuegoCarro.domain.values.player.QuantityWinner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Player {

    @Id
    private IdPlayer idPlayer;

    private Name name;
    private QuantityWinner firstPlace;
    private QuantityWinner secondPlace;
    private QuantityWinner thirdPlace;


}

