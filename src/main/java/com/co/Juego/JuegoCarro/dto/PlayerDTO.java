package com.co.Juego.JuegoCarro.dto;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.function.Predicate;

@Setter
@Data
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class PlayerDTO  {
    @Id
    private String idPlayer;
    private String name;
    private Integer firstPlace;
    private Integer secondPlace;
    private Integer thirdPlace;
    private String idGame;
    private String idCar;

}
