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
public class DriverDTO {
    @Id
    private String idDriver;
    // @NotBlank
    private String throwDice;
    private String idPlayer;

}
