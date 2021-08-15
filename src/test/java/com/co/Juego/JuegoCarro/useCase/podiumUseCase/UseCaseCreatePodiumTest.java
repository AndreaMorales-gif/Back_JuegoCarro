package com.co.Juego.JuegoCarro.useCase.podiumUseCase;

import com.co.Juego.JuegoCarro.domain.model.Driver;
import com.co.Juego.JuegoCarro.domain.model.Podium;
import com.co.Juego.JuegoCarro.dto.DriverDTO;
import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPodium;
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
class UseCaseCreatePodiumTest {

    @SpyBean
    UseCaseCreatePodium useCaseCreatePodium;

    @MockBean
    RepositoryPodium repositoryPodium;

    @Test
    void createPodium(){
        var podiumDTO = new PodiumDTO("7","2" ,"Andres","Carlos","Pablo");
        var podium = new Podium();
        podium.setIdPodium("7");
        podium.setIdGame("2");
        podium.setFirstPlace("Andres");
        podium.setSecondPlace("Carlos");
        podium.setThirdPlace("Pablo");

        when(repositoryPodium.save(Mockito.any(Podium.class))).thenReturn(Mono.just(podium));

        var response = useCaseCreatePodium.createPodium(podiumDTO);

        Assertions.assertEquals(response.block(), podiumDTO);
    }
}