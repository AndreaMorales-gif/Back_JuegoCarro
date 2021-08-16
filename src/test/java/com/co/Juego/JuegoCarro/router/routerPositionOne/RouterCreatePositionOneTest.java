package com.co.Juego.JuegoCarro.router.routerPositionOne;


import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.useCase.positionOneUseCase.UseCaseCreatePositionOne;
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
@ContextConfiguration(classes = {RouterCreatePositionOne.class})
class RouterCreatePositionOneTest {

        @MockBean
        private UseCaseCreatePositionOne useCaseCreatePositionOne;

        @Autowired
        private WebTestClient webTestClient;

        @Test
        public void crearPositionOneRouter(){
            PositionOneDTO positionOneDTO = new PositionOneDTO("7","2","Carlos","5",2);

            when(useCaseCreatePositionOne.createPositionOne(positionOneDTO)).thenReturn(Mono.just(positionOneDTO));

            webTestClient.post().uri("/createPositionOne")
                    .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                    .body(Mono.just(positionOneDTO), PositionOneDTO.class)
                    .exchange()
                    .expectStatus().isOk()
                    .expectBody(PositionOneDTO.class)
                    .value(userResponse ->{
                        Assertions.assertThat(userResponse.getIdPositionOne()).isEqualTo(positionOneDTO.getIdPositionOne());
                    });
        }
}
