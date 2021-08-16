package com.co.Juego.JuegoCarro.router.routerPositionTwo;

import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.useCase.positionTwoUseCase.UseCaseFindAllPositionTwo;
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
@ContextConfiguration(classes = {RouterFindAllPositionTwo.class})
class RouterFindAllPositionTwoTest {


        @MockBean
        private UseCaseFindAllPositionTwo useCaseFindAllPositionTwo;

        @Autowired
        private WebTestClient webTestClient;

        @Test
        public void findAlllPositionTwoRouter(){
            PositionTwoDTO positionTwoDTO = new PositionTwoDTO("7","2","Carlos","5",2);

            when(useCaseFindAllPositionTwo.findByAllPositionTwo()).thenReturn(Flux.just(positionTwoDTO));

            webTestClient.get()
                    .uri("/findAllPositionTwo").accept(APPLICATION_JSON)
                    .exchange()
                    .expectStatus().isOk()
                    .expectHeader().contentType(APPLICATION_JSON)
                    .expectBodyList(PositionTwoDTO.class);
        }
}