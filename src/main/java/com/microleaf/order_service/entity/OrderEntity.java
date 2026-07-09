package com.microleaf.order_service.entity;


import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class OrderEntity {
    private Long id;
    private UUID orderId;
    private String product;
    private LocalDateTime orderDate;
}
