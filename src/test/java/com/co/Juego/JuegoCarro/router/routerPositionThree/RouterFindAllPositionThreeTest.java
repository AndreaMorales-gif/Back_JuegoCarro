package com.co.Juego.JuegoCarro.router.routerPositionThree;

import com.co.Juego.JuegoCarro.dto.PositionThreeDTO;
import com.co.Juego.JuegoCarro.useCase.positionThreeUseCase.UseCaseFindAllPositionThree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@WebFluxTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {RouterFindAllPositionThree.class})

class RouterFindAllPositionThreeTest {
    @MockBean
    private UseCaseFindAllPositionThree useCaseFindAllPositionThree;

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void findAlllPositionThreeRouter(){
        PositionThreeDTO positionThreeDTO = new PositionThreeDTO("7","2","Carlos","5",2);

        when(useCaseFindAllPositionThree.findByAllPositionThree()).thenReturn(Flux.just(positionThreeDTO));

        webTestClient.get()
                .uri("/findAllPositionThree").accept(APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(APPLICATION_JSON)
                .expectBodyList(PositionThreeDTO.class);
    }
}