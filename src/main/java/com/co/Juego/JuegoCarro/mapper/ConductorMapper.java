package com.co.Juego.JuegoCarro.mapper;

import com.co.Juego.JuegoCarro.domain.model.Driver;
import com.co.Juego.JuegoCarro.dto.DriverDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ConductorMapper {

    public Function<DriverDTO, Driver> mapperToDriver(String id){
        return updateDriver -> {
            Driver driver = new Driver();
            driver.setIdDriver(id);
            driver.setDriverPosition(updateDriver.getDriverPosition());
            driver.setIdLane(updateDriver.getIdLane());
            driver.setIdCar(updateDriver.getIdCar());
            driver.setIdPlayer(updateDriver.getIdPlayer());
            return driver;
        };
    }

    public Function<Driver,DriverDTO> mapperToDriverDTO(){
        return driver -> new DriverDTO(
                driver.getIdDriver(),
                driver.getDriverPosition(),
                driver.getIdLane(),
                driver.getIdCar(),
                driver.getIdPlayer()
        );
    }
}
