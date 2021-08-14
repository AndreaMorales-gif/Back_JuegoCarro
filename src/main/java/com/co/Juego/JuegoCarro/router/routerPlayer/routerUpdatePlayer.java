package com.co.Juego.JuegoCarro.router.routerPlayer;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseUpdatePlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;


import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
@Configuration
public class routerUpdatePlayer {
    @Bean
    public RouterFunction<ServerResponse> modifyPlayer(UseCaseUpdatePlayer useCaseUpdatePlayer){
        return route(PUT("/editPlayer").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PlayerDTO.class)
                        .flatMap(playerDTO -> useCaseUpdatePlayer.updatePlayer(playerDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .bodyValue(result))
                        )
        );
    }
}
