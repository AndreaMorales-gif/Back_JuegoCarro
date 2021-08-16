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
@Document (collection = "podium")
public class Podium {

    @Id
    private String idPodium;

    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;


}
