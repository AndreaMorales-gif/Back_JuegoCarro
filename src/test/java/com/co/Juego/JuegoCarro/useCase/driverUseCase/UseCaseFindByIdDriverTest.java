package com.co.Juego.JuegoCarro.useCase.driverUseCase;

import com.co.Juego.JuegoCarro.domain.model.Driver;
import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindByIdDriverTest {
    @SpyBean
    UseCaseFindByIdDriver useCaseFindByIdDriver;

    @MockBean
    RepositoryDriver repositoryDriver;

    @Test
    void findByIdDriver(){
        var driverDTO = new DriverDTO("4",6 ,"8","9","1");
        var driver = new Driver();
        driver.setIdDriver("4");
        driver.setDriverPosition(6);
        driver.setIdLane("8");
        driver.setIdCar("9");
        driver.setIdPlayer("1");

        when(repositoryDriver.findById(Mockito.any(String.class))).thenReturn(Mono.just(driver));

        var response = useCaseFindByIdDriver.findByIdDriver(driverDTO.getIdDriver());

        Assertions.assertEquals(response.block().getIdDriver(), "4");
    }

}