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
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseUpdatePlayerTest {

    @SpyBean
    UseCaseUpdatePlayer useCaseUpdatePlayer;

    @MockBean
    RepositoryPlayer repositoryPlayer;

    @Test
    void updatePlayer(){
        var playerDTO = new PlayerDTO("7", "Carlos", 0, 0, 0, "5", "7");
        var player = new Player();
        player.setIdPlayer("7");
        player.setName("Carlos");
        player.setFirstPlace(0);
        player.setSecondPlace(0);
        player.setThirdPlace(0);
        player.setIdGame("5");
        player.setIdDriver("7");

        when(repositoryPlayer.save(Mockito.any(Player.class))).thenReturn(Mono.just(player));

        var response = useCaseUpdatePlayer.updatePlayer(playerDTO);

        Assertions.assertEquals(response.block(), playerDTO);
    }
}