package com.myeshop.Core.order.event;

import lombok.Data;

@Data
public class OrderApprovedEvent {

    private String orderId;
    private String status;
}
