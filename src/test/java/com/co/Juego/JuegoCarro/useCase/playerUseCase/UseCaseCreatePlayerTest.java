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
        PlayerDTO playerDTO = new PlayerDTO("7", "Carlos",  "5",2 );
        Player player = new Player("7", "Carlos",  "5",2);

        when(repositoryPlayer.save(Mockito.any(Player.class))).thenReturn(Mono.just(player));

        Mono<PlayerDTO> response = useCaseCreatePlayer.createPlayer(playerDTO);

        Assertions.assertEquals(response.block(), playerDTO);
    }

}