package com.co.Juego.JuegoCarro.dto;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class DriverDTO {
    @Id
    private String idDriver;
    // @NotBlank
    private Integer driverPosition;
    private String idLane;
    private String idCar;
    private String idPlayer;

}
