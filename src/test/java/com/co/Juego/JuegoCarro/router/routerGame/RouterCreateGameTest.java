package com.co.Juego.JuegoCarro.router.routerGame;

import com.co.Juego.JuegoCarro.dto.GameDTO;
import com.co.Juego.JuegoCarro.useCase.gameUseCase.UseCaseCreateGame;
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
@ContextConfiguration(classes = {RouterCreateGame.class})
class RouterCreateGameTest {

    @MockBean
    private UseCaseCreateGame useCaseCreateGame;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void crearGameRouter(){
        GameDTO gameDTO = new GameDTO("5");

        when(useCaseCreateGame.createGame(gameDTO)).thenReturn(Mono.just(gameDTO));

        webTestClient.post().uri("/createGame")
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(gameDTO), GameDTO.class)
                .exchange()
                .expectStatus().isOk()
                .expectBody(GameDTO.class)
                .value(userResponse ->{
                    Assertions.assertThat(userResponse.getIdGame()).isEqualTo(gameDTO.getIdGame());
                });
    }

}