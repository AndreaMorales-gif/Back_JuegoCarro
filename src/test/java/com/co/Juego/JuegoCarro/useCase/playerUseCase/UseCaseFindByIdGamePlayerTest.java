package com.co.Juego.JuegoCarro.useCase.playerUseCase;

import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindByIdGamePlayerTest {
    @SpyBean
    UseCaseFindByIdGamePlayer useCaseFindByIdGamePlayer;

    @MockBean
    RepositoryPlayer repositoryPlayer;

    @Test
    void findByIdPlayer() {
        var playerDTO = new PlayerDTO("7","Carlos",0,0,0,"5","7");
        var player = new Player();
        player.setIdPlayer("7");
        player.setName("Carlos");
        player.setFirstPlace(0);
        player.setSecondPlace(0);
        player.setThirdPlace(0);
        player.setIdGame("5");
        player.setIdDriver("10");

        when(repositoryPlayer.findByIdGame(Mockito.any(String.class))).thenReturn(Flux.just(player));

        var response = useCaseFindByIdGamePlayer.findPlayersByGameId(playerDTO.getIdGame());

        Assertions.assertEquals(response.blockFirst().getIdGame(), "5");
    }
}