package com.myeshop.Core.order.event;

import lombok.Data;

@Data
public class OrderRejectedEvent {

    private String orderId;
    private String status;
}
