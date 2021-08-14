package com.co.Juego.JuegoCarro.router.routerPlayer;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseCreatePlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

@Configuration
public class routerCreatePlayer {

    @Bean
    public RouterFunction<ServerResponse> createPlayer(UseCaseCreatePlayer useCaseCreatePlayer){
        return route(POST("/createPlayer").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PlayerDTO.class)
                        .flatMap(playerDTO -> useCaseCreatePlayer.createPlayer(playerDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                            .bodyValue(result))
                        )
        );
    }
}
