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
class UseCaseCreatePlayerTest {
    @SpyBean
    UseCaseCreatePlayer useCaseCreatePlayer;

    @MockBean
    RepositoryPlayer repositoryPlayer;

    @Test
    void createPlayer(){
        var playerDTO = new PlayerDTO("7", "Carlos",  "5",2 );
        var player = new Player();
        player.setIdPlayer("7");
        player.setName("Carlos");
        player.setCar("5");
        player.setKilometer(2);

        when(repositoryPlayer.save(Mockito.any(Player.class))).thenReturn(Mono.just(player));

        var response = useCaseCreatePlayer.createPlayer(playerDTO);

        Assertions.assertEquals(response.block(), playerDTO);
    }

}