package com.co.Juego.JuegoCarro.useCase.gameUseCase;

import com.co.Juego.JuegoCarro.domain.model.Game;
import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.dto.GameDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseCreateGameTest {

    @SpyBean
    UseCaseCreateGame useCaseCreateGame;

    @MockBean
    RepositoryGame repositoryGame;

    @Test
    void crearGame(){
        var gameDTO = new GameDTO("5");
        var game = new Game();
        game.setIdGame("5");

        when(repositoryGame.save(Mockito.any(Game.class))).thenReturn(Mono.just(game));

        var response = useCaseCreateGame.createGame(gameDTO);

        Assertions.assertEquals(response.block(), gameDTO);
    }
}