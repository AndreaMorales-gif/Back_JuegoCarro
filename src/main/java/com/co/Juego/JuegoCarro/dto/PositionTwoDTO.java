package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PositionTwoDTO {

    @Id
    private String idPositionTwo;

    private String lane;
    private String namePositionTwo;
    private String carPositionTwo;
    private Integer kilometerPositionTwo;
}
