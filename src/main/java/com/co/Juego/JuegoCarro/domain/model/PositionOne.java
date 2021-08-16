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
@Document
public class PositionOne {

    @Id
    private String idPositionOne;

    private String lane;
    private String namePositionOne;
    private String carPositionOne;
    private Integer kilometerPositionOne;
}
