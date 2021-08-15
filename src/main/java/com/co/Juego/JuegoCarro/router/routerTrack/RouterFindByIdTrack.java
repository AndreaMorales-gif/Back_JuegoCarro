package com.co.Juego.JuegoCarro.router.routerTrack;
;
import com.co.Juego.JuegoCarro.dto.TrackDTO;
import com.co.Juego.JuegoCarro.useCase.trackUseCase.UseCaseFindByIdTrack;
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
public class RouterFindByIdTrack {
    @Bean
    public RouterFunction<ServerResponse> findByIdTrack(UseCaseFindByIdTrack useCaseFindByIdTrack){
        return route(
                GET("/getIdTrack/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindByIdTrack.findById(request.pathVariable("id")), TrackDTO.class))
        );
    }
}
