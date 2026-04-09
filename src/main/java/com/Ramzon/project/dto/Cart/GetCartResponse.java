package com.Ramzon.project.dto.Cart;

import java.math.BigDecimal;
import java.util.List;

public record GetCartResponse(

    Long userId,
    List<CartItemResponse> items,
    BigDecimal totalPrice

) {}
