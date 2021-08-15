package com.co.Juego.JuegoCarro.useCase.carUseCase;

import com.co.Juego.JuegoCarro.domain.model.Car;
import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryCar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class UpdateCarUseCaseTest {
    @SpyBean
    UpdateCarUseCase updateCarUseCase;

    @MockBean
    RepositoryCar repositoryCar;

    @Test
    void updateCar(){
        var carDTO = new CarDTO("8", "5", "9", "2", true, 5, 5);
        var car = new Car();
        car.setIdCar("8");
        car.setIdDriver("5");
        car.setIdLane("2");
        car.setIdGame("9");
        car.setDesiredDistance(true);
        car.setTravelDistance(5);
        car.setActualPosition(5);


        when(repositoryCar.save(Mockito.any(Car.class))).thenReturn(Mono.just(car));

        var response = updateCarUseCase.updateCar(carDTO);

        Assertions.assertEquals(response.block(), carDTO);

    }

}