package com.co.Juego.JuegoCarro.router.routerLane;
import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.useCase.laneUseCase.UseCaseCreateLane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreateLane {
    @Bean
    public RouterFunction<ServerResponse> createLane(UseCaseCreateLane createLaneUseCase){
        return route(POST("/createLane").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(LaneDTO.class)
                        .flatMap(laneDTO -> createLaneUseCase.createLane(laneDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
