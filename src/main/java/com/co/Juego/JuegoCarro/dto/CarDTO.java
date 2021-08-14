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
public class CarDTO {
    @Id
    private String idCar;
    // @NotBlank
    private String idDriver;
    private String arrivalGoal;
    private String idLane;

}
