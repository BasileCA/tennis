package com.steve.tennis;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record Rank(
        @Positive(message = "Position must be a positive number") int positon,
        @PositiveOrZero(message = "Points must be more than zero") int points) {
}
