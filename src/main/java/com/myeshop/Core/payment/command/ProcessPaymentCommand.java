package com.myeshop.Core.payment.command;

import com.myeshop.Core.payment.rest.PaymentDetail;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class ProcessPaymentCommand {

    @TargetAggregateIdentifier
    private final String recordId;
    private final String orderId;
    private final String paymentId;
    private final PaymentDetail paymentDetail;
}
