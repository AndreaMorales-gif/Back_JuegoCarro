package com.co.Juego.JuegoCarro.router.routerPlayer;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseFindByIdGamePlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;


import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
@Configuration
public class RouterFindByIdGamePlayer {

    @Bean
    public RouterFunction<ServerResponse> findPlayersByGameId(UseCaseFindByIdGamePlayer useCaseFindByIdGamePlayer){
        return route(GET("/playersGame/{idGame}").and(accept(MediaType.TEXT_PLAIN)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindByIdGamePlayer.findPlayersByGameId(request.pathVariable("idGame")), PlayerDTO.class))
        );
    }
}
