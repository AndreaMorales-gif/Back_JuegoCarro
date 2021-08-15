package com.co.Juego.JuegoCarro.router.routerPodium;

import com.co.Juego.JuegoCarro.dto.PodiumDTO;
import com.co.Juego.JuegoCarro.useCase.podiumUseCase.UseCaseCreatePodium;
import com.co.Juego.JuegoCarro.useCase.podiumUseCase.UseCaseUpdatePodium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RouterUpdatePodium {
    @Bean
    public RouterFunction<ServerResponse> updatePodium(UseCaseUpdatePodium useCaseUpdatePodium){
        return route(PUT("/updatePodium").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(PodiumDTO.class)
                        .flatMap(podiumDTO -> useCaseUpdatePodium.updatePodium(podiumDTO)
                                .flatMap(result-> ServerResponse.ok()
                                        .contentType(MediaType.APPLICATION_JSON)
                                        .bodyValue(result))
                        )
        );
    }
}
