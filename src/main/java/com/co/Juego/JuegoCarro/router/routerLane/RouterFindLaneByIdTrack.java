package com.co.Juego.JuegoCarro.router.routerLane;

import com.co.Juego.JuegoCarro.dto.CarDTO;
import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.useCase.carUseCase.FindCarsByIdDriverUseCase;
import com.co.Juego.JuegoCarro.useCase.laneUseCase.FindLaneByIdTrackUseCase;
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
public class RouterFindLaneByIdTrack {
    @Bean
    public RouterFunction<ServerResponse> findLeanByIdDriver(FindLaneByIdTrackUseCase findLaneByIdTrackUseCase){
        return route(GET("/getIdTrack/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(findLaneByIdTrackUseCase.findLaneByTrackId(request.pathVariable("id")), LaneDTO.class))
        );
    }
}