package com.co.Juego.JuegoCarro.router.routerPlayer;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseCreatePlayer;
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
@ContextConfiguration(classes = {RouterCreatePlayer.class})
class RouterCreatePlayerTest {
    @MockBean
    private UseCaseCreatePlayer useCaseCreatePlayer;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void crearPlayerRouter(){
        PlayerDTO playerDTO = new PlayerDTO("7", "Carlos",  "5",2 );;

        when(useCaseCreatePlayer.createPlayer(playerDTO)).thenReturn(Mono.just(playerDTO));

        webTestClient.post().uri("/createPlayer")
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                .body(Mono.just(playerDTO), PlayerDTO.class)
                .exchange()
                .expectStatus().isOk()
                .expectBody(PlayerDTO.class)
                .value(userResponse ->{
                    Assertions.assertThat(userResponse.getIdPlayer()).isEqualTo(playerDTO.getIdPlayer());
                });
    }

}