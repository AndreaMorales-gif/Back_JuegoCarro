package com.co.Juego.JuegoCarro.router.routerPositionOne;

import com.co.Juego.JuegoCarro.dto.PositionOneDTO;
import com.co.Juego.JuegoCarro.useCase.positionOneUseCase.UseCaseCreatePositionOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreatePositionOne {
    @Bean
    public RouterFunction<ServerResponse> createPositionOne(UseCaseCreatePositionOne useCaseCreatePositionOne){
        return route(POST("/createPositionOne").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PositionOneDTO.class)
                        .flatMap(positionOneDTO -> useCaseCreatePositionOne.createPositionOne(positionOneDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
