package com.myeshop.Core.Product.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRollbackEvent {

    private final String productId;
    private final int quantity;
    private final String orderId;
}
