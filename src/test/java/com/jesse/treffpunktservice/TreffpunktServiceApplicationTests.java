package com.jesse.treffpunktservice;

import com.jesse.treffpunktservice.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TreffpunktServiceApplicationTests {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void whenPostRequestThenUserCreated() {
        var expectedUser = new User("Hans", "Guenther", "Gutenbergschule", 26, Instant.now());
        webTestClient.post()
                .uri("/users")
                .bodyValue(expectedUser)
                .exchange()
                .expectStatus().isCreated()
                .expectBody(User.class)
                .value(actualUser -> {
                    assertThat(actualUser).isNotNull();
                    assertThat(actualUser.firstName()).isEqualTo(expectedUser.firstName());
                });

    }

}
