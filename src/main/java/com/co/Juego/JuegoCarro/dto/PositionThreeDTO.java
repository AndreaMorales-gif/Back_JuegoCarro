package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PositionThreeDTO {

    @Id
    private String idPositionThree;

    private String lane;
    private String namePositionThree;
    private String carPositionThree;
    private Integer kilometerPositionThree;
}
