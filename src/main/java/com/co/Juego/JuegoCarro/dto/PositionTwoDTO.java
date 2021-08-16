package com.co.Juego.JuegoCarro.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class PositionTwoDTO {

    @Id
    private String idPositionTwo;

    private String lane;
    private String namePositionTwo;
    private String carPositionTwo;
    private Integer kilometerPositionTwo;
}
