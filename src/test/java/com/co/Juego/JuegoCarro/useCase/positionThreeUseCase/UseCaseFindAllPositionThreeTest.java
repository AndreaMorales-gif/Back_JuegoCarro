package com.co.Juego.JuegoCarro.useCase.positionThreeUseCase;

import com.co.Juego.JuegoCarro.domain.model.PositionThree;
import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPositionThree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindAllPositionThreeTest {
    @SpyBean
    UseCaseFindAllPositionThree useCaseFindAllPositionThree;

    @MockBean
    RepositoryPositionThree repositoryPositionThree;

    @Test
    void findAllPosition3(){
        var positionThreeDTO = new PositionThreeDTO("7","2","Carlos","5",2);
        var positionThree = new PositionThree("7","2","Carlos","5",2);

        when(repositoryPositionThree.findAll()).thenReturn(Flux.just(positionThree));

        var response = useCaseFindAllPositionThree.findByAllPositionThree();

        Assertions.assertEquals(response.blockFirst(), positionThreeDTO);
    }
}
