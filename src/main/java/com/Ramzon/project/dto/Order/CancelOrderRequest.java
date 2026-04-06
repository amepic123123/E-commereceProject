package com.Ramzon.project.dto.Order;


import jakarta.validation.constraints.Size;

public record CancelOrderRequest(

    @Size(max = 500, message = "Reason must be less than 500 characters")
    String reason

) {}
