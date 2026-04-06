package com.Ramzon.project.dto.Order;

import com.Ramzon.project.OrderStatus;

public record GetOrderResponse(

    Long orderId,
    OrderStatus status,
    String reason


) {}
