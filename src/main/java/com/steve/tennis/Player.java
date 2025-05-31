package com.steve.tennis;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record Player(
        @NotBlank(message = "First Name is mandatory") String firstName,
        @NotBlank(message = "Last Name is mandatory") String lastName,
        @NotNull(message = "Birth date is mandatory") @PastOrPresent(message = "Birth date must be past or present") LocalDate birhtDate,
        @Valid Rank rank) {
}
