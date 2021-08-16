package com.co.Juego.JuegoCarro.router.routerPositionTwo;

import com.co.Juego.JuegoCarro.dto.PositionTwoDTO;
import com.co.Juego.JuegoCarro.useCase.positionTwoUseCase.UseCaseCreatePositionTwo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@WebFluxTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RouterCreatePositionTwo.class})
class RouterCreatePositionTwoTest {

        @MockBean
        private UseCaseCreatePositionTwo useCaseCreatePositionTwo;

        @Autowired
        private WebTestClient webTestClient;

        @Test
        public void crearPositionTwoRouter(){
            PositionTwoDTO positionTwoDTO = new PositionTwoDTO("7","2","Carlos","5",2);

            when(useCaseCreatePositionTwo.createPositionTwo(positionTwoDTO)).thenReturn(Mono.just(positionTwoDTO));

            webTestClient.post().uri("/createPositionTwo")
                    .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                    .body(Mono.just(positionTwoDTO), PositionTwoDTO.class)
                    .exchange()
                    .expectStatus().isOk()
                    .expectBody(PositionTwoDTO.class)
                    .value(userResponse ->{
                        Assertions.assertThat(userResponse.getIdPositionTwo()).isEqualTo(positionTwoDTO.getIdPositionTwo());
                    });
        }
    }
