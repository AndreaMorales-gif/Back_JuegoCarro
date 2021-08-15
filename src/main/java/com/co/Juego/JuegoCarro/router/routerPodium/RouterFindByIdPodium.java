package com.co.Juego.JuegoCarro.router.routerPodium;

import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import com.co.Juego.JuegoCarro.useCase.podiumUseCase.UseCaseFindByIdPodium;
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
public class RouterFindByIdPodium {
    @Bean
    public RouterFunction<ServerResponse> findByIdPodium(UseCaseFindByIdPodium useCaseFindByIdPodium){
        return route(
                GET("/getIdPodium/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request-> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseFindByIdPodium.findById(request.pathVariable("id")), PodiumDTO.class))
        );
    }
}
