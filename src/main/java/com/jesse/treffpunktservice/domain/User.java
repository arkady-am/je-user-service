package com.jesse.treffpunktservice.domain;

import java.time.Instant;

public record User(
        String firstName,
        String lastName,
        String city,
        int age,
        Instant graduatedAt
) {

}
