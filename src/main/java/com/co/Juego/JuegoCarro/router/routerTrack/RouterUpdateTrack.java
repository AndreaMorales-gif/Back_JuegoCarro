package com.co.Juego.JuegoCarro.router.routerTrack;

import com.co.Juego.JuegoCarro.dto.TrackDTO;
import com.co.Juego.JuegoCarro.useCase.trackUseCase.UseCaseUpdateTrack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterUpdateTrack {
    @Bean
    public RouterFunction<ServerResponse> updateTrack(UseCaseUpdateTrack useCaseUpdateTrack){
        return route(POST("/updateTrack").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(TrackDTO.class)
                        .flatMap(trackDTO -> useCaseUpdateTrack.updateTrack(trackDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
