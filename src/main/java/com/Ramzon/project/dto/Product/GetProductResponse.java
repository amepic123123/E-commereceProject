package com.Ramzon.project.dto.Product;

import java.math.BigDecimal;

public record GetProductResponse(

    String name,
    String description,
    BigDecimal price

) {}
