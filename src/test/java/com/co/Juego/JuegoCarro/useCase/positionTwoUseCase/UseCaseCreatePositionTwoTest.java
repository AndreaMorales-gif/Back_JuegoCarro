package com.co.Juego.JuegoCarro.useCase.positionTwoUseCase;


import com.co.Juego.JuegoCarro.domain.model.PositionTwo;
import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseCreatePositionTwoTest {

    @SpyBean
    UseCaseCreatePositionTwo useCaseCreatePositionTwo;

    @MockBean
    RepositoryPositionTwo repositoryPositionTwo;

    @Test
    void createPosition2(){
        PositionTwoDTO positionTwoDTO = new PositionTwoDTO("7","2","Carlos","5",2);
        PositionTwo positionTwo = new PositionTwo("7","2","Carlos","5",2);

        when(repositoryPositionTwo.save(Mockito.any(PositionTwo.class))).thenReturn(Mono.just(positionTwo));

        Mono<PositionTwoDTO> response = useCaseCreatePositionTwo.createPositionTwo(positionTwoDTO);

        Assertions.assertEquals(response.block(), positionTwoDTO);
    }
}