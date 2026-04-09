package com.Ramzon.project.dto.Cart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record RemoveCartItemRequest(

    @NotNull(message = "Product Item ID is required")
    @Positive (message = "Product Item ID must be a positive number")
    Long product_item_id,
    
    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be a positive number")
    Integer quantity

) {}
