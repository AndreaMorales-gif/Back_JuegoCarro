package com.co.Juego.JuegoCarro.router.routerLane;
import com.co.Juego.JuegoCarro.dto.LaneDTO;
import com.co.Juego.JuegoCarro.useCase.laneUseCase.UseCaseUpdateLane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterUpdateLane {
    @Bean
    public RouterFunction<ServerResponse> updateLane(UseCaseUpdateLane updateLaneUseCase){
        return route(PUT("/updateLane").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(LaneDTO.class)
                        .flatMap(laneDTO -> updateLaneUseCase.updateLane(laneDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
