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
public class PositionOneDTO {

    @Id
    private String idPositionOne;

    private String lane;
    private String namePositionOne;
    private String carPositionOne;
    private Integer kilometerPositionOne;
}
