package com.Ramzon.project.dto.Product;

import java.util.List;

public record GetProductResponse(

    String name,
    String description,
    List<GetItemResponse> items

) {}
