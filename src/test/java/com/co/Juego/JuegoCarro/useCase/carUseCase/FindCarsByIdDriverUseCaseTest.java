package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.domain.model.Car;
import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseFindByIdGamePlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class FindCarsByIdDriverUseCaseTest {

    @SpyBean
    FindCarsByIdDriverUseCase findCarsByIdDriverUseCase;

    @MockBean
    RepositoryCar repositoryCar;

    @Test
    void findByIdDriver() {
        var carDTO = new CarDTO("8", "5", "9", "2", true, 5, 5);
        var car = new Car();
        car.setIdCar("8");
        car.setIdDriver("5");
        car.setIdLane("2");
        car.setIdGame("9");
        car.setDesiredDistance(true);
        car.setTravelDistance(5);
        car.setActualPosition(5);

        when(repositoryCar.findByIdDriver(Mockito.any(String.class))).thenReturn(Flux.just(car));

        var response =findCarsByIdDriverUseCase.findCarsByIdDriver(carDTO.getIdDriver());

        Assertions.assertEquals(response.blockFirst().getIdDriver(), "5");
    }

}