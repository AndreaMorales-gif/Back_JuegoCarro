package com.co.Juego.JuegoCarro.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document (collection = "positionTwo")
public class PositionTwo {
    @Id
    private String idPositionTwo;

    private String lane;
    private String namePositionTwo;
    private String carPositionTwo;
    private Integer kilometerPositionTwo;
}
