package com.co.Juego.JuegoCarro.dto;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PlayerDTO  {
    @Id
    private String idPlayer;

    private String name;
    private String car;
    private Integer kilometer;
}
