package com.co.Juego.JuegoCarro.useCase.playerUseCase;

import com.co.Juego.JuegoCarro.domain.model.Player;
import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.repositories.RepositoryPlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static com.mongodb.assertions.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@SpringBootTest
class UseCaseFindByIdPlayerTest {

    @SpyBean
    UseCaseFindByIdPlayer useCaseFindByIdPlayer;

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
        player.setIdCar("10");

        when(repositoryPlayer.findById(Mockito.any(String.class))).thenReturn(Mono.just(player));

        var respuesta = useCaseFindByIdPlayer.findById(playerDTO.getIdPlayer());

        Assertions.assertEquals(respuesta.block().getIdPlayer(), "7");
    }
}