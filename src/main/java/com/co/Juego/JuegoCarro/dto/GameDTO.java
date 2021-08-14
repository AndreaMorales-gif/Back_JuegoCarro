package com.co.Juego.JuegoCarro.dto;

import com.co.Juego.JuegoCarro.domain.values.game.IdGame;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class GameDTO {
    @Id
    private String idGame;
}
