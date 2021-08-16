package com.co.Juego.JuegoCarro.router.routerPositionThree;

import com.co.Juego.JuegoCarro.dto.PlayerDTO;
import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.useCase.playerUseCase.UseCaseFindByIdPlayer;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseCreatePositionThree;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseFindAllPositionThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterFindAllPositionThree {
    @Bean
    public RouterFunction<ServerResponse> findByAllPositionThree(UseCaseFindAllPositionThree useCaseFindAllPositionThree){
        return route(
                GET("/findAllPositionThree").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindAllPositionThree.findByAllPositionThree(), PositionThreeDTO.class))
        );
    }
}
