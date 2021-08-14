package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Car;
import com.co.Juego.JuegoCarro.dto.CarDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CarroMapper {
    public Function<CarDTO, Car> mapperToCar(String id) {
        return updateCar -> {
            Car car = new Car();
            car.setIdCar(updateCar.getIdCar());
            car.setDesiredDistance(updateCar.getDesiredDistance());
            car.setActualPosition(updateCar.getActualPosition());
            car.setTravelDistance(updateCar.getTravelDistance());
            car.setIdDriver(updateCar.getIdDriver());
            car.setIdGame(updateCar.getIdGame());
            car.setIdLane(updateCar.getIdLane());
            return car;
        };

    }

    public Function<Car, CarDTO> mappertoCarDTO(){
        return car -> new CarDTO(
                car.getIdCar(),
                car.getIdDriver(),
                car.getIdGame(),
                car.getIdLane(),
                car.getDesiredDistance(),
                car.getActualPosition(),
                car.getTravelDistance()
        );
    }
}
