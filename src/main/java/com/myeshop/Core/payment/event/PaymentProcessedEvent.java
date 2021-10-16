package com.myeshop.Core.payment.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PaymentProcessedEvent {

    private final String recordId;
    private final String orderId;
    private final String paymentId;
}
