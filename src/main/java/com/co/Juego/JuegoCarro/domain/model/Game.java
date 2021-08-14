package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.game.IdGame;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Game {
    @Id
    private IdGame idGame;


}
