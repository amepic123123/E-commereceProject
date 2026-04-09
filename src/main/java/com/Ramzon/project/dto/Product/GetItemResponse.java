package com.Ramzon.project.dto.Product;

import java.math.BigDecimal;

public record GetItemResponse(
    Long product_item_id,
    BigDecimal price,
    Integer quantity
) {} 