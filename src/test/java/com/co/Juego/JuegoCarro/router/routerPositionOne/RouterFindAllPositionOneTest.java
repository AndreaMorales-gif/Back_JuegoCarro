package com.co.Juego.JuegoCarro.router.routerPositionOne;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.useCase.positionOneUseCase.UseCaseFindAllPositionOne;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@WebFluxTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RouterFindAllPositionOne.class})

class RouterFindAllPositionOneTest {
    @MockBean
    private UseCaseFindAllPositionOne useCaseFindAllPositionOne;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void findAlllPositionOneRouter(){
        PositionOneDTO positionOneDTO = new PositionOneDTO("7","2","Carlos","5",2);

        when(useCaseFindAllPositionOne.findByAllPositionOne()).thenReturn(Flux.just(positionOneDTO));

        webTestClient.get()
                .uri("/findAllPositionOne").accept(APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON)
                .expectBodyList(PositionOneDTO.class);
    }
}