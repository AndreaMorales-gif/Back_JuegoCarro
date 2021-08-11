package com.co.Juego.JuegoCarro.domain.model;

import com.co.Juego.JuegoCarro.domain.values.driver.IdDriver;
import com.co.Juego.JuegoCarro.domain.values.podium.FirstPlace;
import com.co.Juego.JuegoCarro.domain.values.podium.IdPodium;
import com.co.Juego.JuegoCarro.domain.values.podium.SecondPlace;
import com.co.Juego.JuegoCarro.domain.values.podium.ThirdPlace;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Podium {

    @Id
    private IdPodium idPodium;

    private IdDriver idDriver;
    private FirstPlace firstPlace;
    private SecondPlace secondPlace;
    private ThirdPlace thirdPlace;

    public IdPodium getIdPodium() {
        return idPodium;
    }

    public void setIdPodium(IdPodium idPodium) {
        this.idPodium = idPodium;
    }

    public IdDriver getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(IdDriver idDriver) {
        this.idDriver = idDriver;
    }

    public FirstPlace getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(FirstPlace firstPlace) {
        this.firstPlace = firstPlace;
    }

    public SecondPlace getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(SecondPlace secondPlace) {
        this.secondPlace = secondPlace;
    }

    public ThirdPlace getThirdPlace() {
        return thirdPlace;
    }

    public void setThirdPlace(ThirdPlace thirdPlace) {
        this.thirdPlace = thirdPlace;
    }
}
