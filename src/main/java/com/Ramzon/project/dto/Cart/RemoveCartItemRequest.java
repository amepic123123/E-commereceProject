package com.Ramzon.project.dto.Cart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record RemoveCartItemRequest(

    @NotNull(message = "Product ID is required")
    @Positive (message = "Product ID must be a positive number")
    Long productId,
    
    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be a positive number")
    Integer quantity

) {}
