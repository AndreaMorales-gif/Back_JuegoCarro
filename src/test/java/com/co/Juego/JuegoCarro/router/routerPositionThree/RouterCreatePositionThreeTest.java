package com.co.Juego.JuegoCarro.router.routerPositionThree;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseCreatePositionThree;
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
@ContextConfiguration(classes = {RouterCreatePositionThree.class})
class RouterCreatePositionThreeTest {

        @MockBean
        private UseCaseCreatePositionThree useCaseCreatePositionThree;

        @Autowired
        private WebTestClient webTestClient;

        @Test
        public void crearPositionThreeRouter(){
            PositionThreeDTO positionThreeDTO = new PositionThreeDTO("7","2","Carlos","5",2);

            when(useCaseCreatePositionThree.createPositionThree(positionThreeDTO)).thenReturn(Mono.just(positionThreeDTO));

            webTestClient.post().uri("/createPositionThree")
                    .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                    .body(Mono.just(positionThreeDTO), PositionThreeDTO.class)
                    .exchange()
                    .expectStatus().isOk()
                    .expectBody(PositionThreeDTO.class)
                    .value(userResponse ->{
                        Assertions.assertThat(userResponse.getIdPositionThree()).isEqualTo(positionThreeDTO.getIdPositionThree());
                    });
        }
    }
