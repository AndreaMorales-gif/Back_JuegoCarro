package com.co.Juego.JuegoCarro.useCase.laneUseCase;

import com.co.Juego.JuegoCarro.domain.model.Lane;
import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryLane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;


@SpringBootTest
class FindByIdLaneUseCaseTest {

    @SpyBean
    UseCaseFindByIdLane findByIdLaneUseCase;

    @MockBean
    RepositoryLane repositoryLane;

    @Test
    void findByIdLane(){
        var laneDTO = new LaneDTO("8", "5", "9", "2", "1");
        var lane = new Lane();
        lane.setIdLane("8");
        lane.setIdCar("5");
        lane.setIdDriver("9");
        lane.setIdTrack("2");
        lane.setIdGame("1");

        when(repositoryLane.findById(Mockito.any(String.class))).thenReturn(Mono.just(lane));

        var response = findByIdLaneUseCase.findById(laneDTO.getIdLane());

        Assertions.assertEquals(response.block().getIdLane(), "8");
    }
}