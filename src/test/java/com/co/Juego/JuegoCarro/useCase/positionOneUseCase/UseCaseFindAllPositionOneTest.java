package com.co.Juego.JuegoCarro.useCase.positionOneUseCase;

import com.co.Juego.JuegoCarro.domain.model.PositionOne;
import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindAllPositionOneTest {
    @SpyBean
    UseCaseFindAllPositionOne useCaseFindAllPositionOne;

    @MockBean
    RepositoryPositionOne repositoryPositionOne;

    @Test
    void findAllPosition1(){
        var positionOneDTO = new PositionOneDTO("7","2","Carlos","5",2);
        var positionOne = new PositionOne("7","2","Carlos","5",2);

        when(repositoryPositionOne.findAll()).thenReturn(Flux.just(positionOne));

        var response = useCaseFindAllPositionOne.findByAllPositionOne();

        Assertions.assertEquals(response.blockFirst(), positionOneDTO);
    }
}