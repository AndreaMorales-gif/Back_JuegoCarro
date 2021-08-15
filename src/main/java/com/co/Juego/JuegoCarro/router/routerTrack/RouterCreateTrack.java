package com.co.Juego.JuegoCarro.router.routerTrack;

import com.co.Juego.JuegoCarro.dto.TrackDTO;
import com.co.Juego.JuegoCarro.useCase.trackUseCase.UseCaseCreateTrack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterCreateTrack {
    @Bean
    public RouterFunction<ServerResponse> createTrack(UseCaseCreateTrack useCaseCreateTrack){
        return route(POST("/createTrack").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TrackDTO.class)
                        .flatMap(trackDTO -> useCaseCreateTrack.createTrack(trackDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
