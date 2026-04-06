package com.Ramzon.project.dto.Cart;

import java.math.BigDecimal;

public record CartItemResponse(
    Long productId,
    String productName,
    String productDescription,
    BigDecimal price,
    Integer quantity
) {}
