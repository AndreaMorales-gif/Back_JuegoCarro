package com.co.Juego.JuegoCarro.useCase.positionTwoUseCase;

import com.co.Juego.JuegoCarro.domain.model.PositionTwo;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindAllPositionTwoTest {

    @SpyBean
    UseCaseFindAllPositionTwo useCaseFindAllPositionTwo;

    @MockBean
    RepositoryPositionTwo repositoryPositionTwo;

    @Test
    void findAllPosition2(){
        var positionTwoDTO = new PositionTwoDTO("7","2","Carlos","5",2);
        var positionTwo = new PositionTwo("7","2","Carlos","5",2);

        when(repositoryPositionTwo.findAll()).thenReturn(Flux.just(positionTwo));

        var response = useCaseFindAllPositionTwo.findByAllPositionTwo();

        Assertions.assertEquals(response.blockFirst(), positionTwoDTO);
    }

}