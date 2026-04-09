package com.Ramzon.project.dto.Cart;

import java.math.BigDecimal;

public record CartItemResponse(
    Long product_item_id,
    String productName,
    String productDescription,
    BigDecimal price,
    Integer quantity
) {}
