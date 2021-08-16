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
@Document (collection = "positionThree")
public class PositionThree {
    @Id
    private String idPositionThree;

    private String lane;
    private String namePositionThree;
    private String carPositionThree;
    private Integer kilometerPositionThree;
}
