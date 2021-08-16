package com.co.Juego.JuegoCarro.router.routerPositionOne;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.useCase.positionOneUseCase.UseCaseFindAllPositionOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterFindAllPositionOne {
    @Bean
    public RouterFunction<ServerResponse> findByAllPositionOne(UseCaseFindAllPositionOne useCaseFindAllPositionOne){
        return route(
                GET("/findAllPositionOne").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindAllPositionOne.findByAllPositionOne(), PositionOneDTO.class))
        );
    }
}
