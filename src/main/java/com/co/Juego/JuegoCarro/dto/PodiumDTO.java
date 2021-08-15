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
public class PodiumDTO {

    @Id
    private String idPodium;

    private String idGame;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;


}
