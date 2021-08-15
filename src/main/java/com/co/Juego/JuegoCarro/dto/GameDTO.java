package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class GameDTO {
    @Id
    private String idGame;;

    private String idTrack;
}
