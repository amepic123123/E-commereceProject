package com.Ramzon.project.dto.Product;

import java.util.List;

public record ListProductResponse(


   List<GetProductResponse> products

) {}
