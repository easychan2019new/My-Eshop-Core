package com.myeshop.Core.order.event;

import lombok.Data;

@Data
public class OrderCanceledEvent {

    private String orderId;
    private String status;
}
