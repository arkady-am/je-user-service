package com.jesse.treffpunktservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

import java.time.Instant;

public record User(
        @NotBlank(message = "The first name cannot be blank!")
        String firstName,
        @NotBlank(message = "The last name cannot be blank!")
        String lastName,
        @NotBlank(message = "The city cannot be blank!")
        String city,
        @NotNull(message = "Age must be defined")
        @Positive(message = "Age must be positive")
        int age,
        @NotNull(message = "Date of graduation muste be defined")
        @Past(message = "Date must be earlier than today")
        Instant graduatedAt
) {

}
