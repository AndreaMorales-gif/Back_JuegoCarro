package com.co.Juego.JuegoCarro.dto;


import com.co.Juego.JuegoCarro.domain.values.player.IdPlayer;
import com.co.Juego.JuegoCarro.domain.values.player.Name;
import com.co.Juego.JuegoCarro.domain.values.player.QuantityWinner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class PlayerDTO {
    @Id
    private String idPlayer;
    private String name;
    private Integer firstPlace;
    private Integer secondPlace;
    private Integer thirdPlace;



}
