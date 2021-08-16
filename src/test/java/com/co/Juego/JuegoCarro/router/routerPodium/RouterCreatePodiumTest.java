package com.co.Juego.JuegoCarro.router.routerPodium;

import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import com.co.Juego.JuegoCarro.useCase.podiumUseCase.UseCaseCreatePodium;
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
@ContextConfiguration(classes = {RouterCreatePodium.class})
class RouterCreatePodiumTest {

        @MockBean
        private UseCaseCreatePodium useCaseCreatePodium;

        @Autowired
        private WebTestClient webTestClient;

        @Test
        public void crearPodiumRouter(){
            PodiumDTO podiumDTO = new PodiumDTO("7","Andres","Carlos","Pablo");

            when(useCaseCreatePodium.createPodium(podiumDTO)).thenReturn(Mono.just(podiumDTO));

            webTestClient.post().uri("/createPodium")
                    .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                    .body(Mono.just(podiumDTO), PodiumDTO.class)
                    .exchange()
                    .expectStatus().isOk()
                    .expectBody(PodiumDTO.class)
                    .value(userResponse ->{
                        Assertions.assertThat(userResponse.getIdPodium()).isEqualTo(podiumDTO.getIdPodium());
                    });
        }

}