package com.co.Juego.JuegoCarro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class PodiumDTO {
    @Id
    private String idPodium;
    // @NotBlank
    private String idDriver;
    private String firstPlace;
    private String secondPlace;
    private String thirdPlace;


}
