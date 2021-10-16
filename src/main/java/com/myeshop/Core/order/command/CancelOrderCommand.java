package com.myeshop.Core.order.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
public class CancelOrderCommand {

    @TargetAggregateIdentifier
    private final String orderId;
}
