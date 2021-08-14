package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.podium.FirstPlace;
import com.co.Juego.JuegoCarro.domain.values.podium.IdPodium;
import com.co.Juego.JuegoCarro.domain.values.podium.SecondPlace;
import com.co.Juego.JuegoCarro.domain.values.podium.ThirdPlace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Podium {

    @Id
    private IdPodium idPodium;

    private IdDriver idDriver;
    private FirstPlace firstPlace;
    private SecondPlace secondPlace;
    private ThirdPlace thirdPlace;


}
