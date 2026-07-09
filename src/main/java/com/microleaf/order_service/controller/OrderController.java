package com.microleaf.order_service.controller;

import com.microleaf.order_service.entity.OrderEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
public class OrderController {

    @GetMapping("/all")
    public List<OrderEntity> getAllOrders() {
        System.out.println("Request received");
        return List.of(
                OrderEntity.builder().id(1L).product("SAMSUNG GALAXY S24 ULTRA").orderId(UUID.randomUUID()).orderDate(LocalDateTime.of(2026,6,13,13,0)).build(),
                OrderEntity.builder().id(2L).product("SAMSUNG GALAXY S24 ULTRA").orderId(UUID.randomUUID()).orderDate(LocalDateTime.of(2026,6,15,15,15)).build()
        );
    }
}
