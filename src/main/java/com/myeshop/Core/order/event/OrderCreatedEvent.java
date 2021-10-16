package com.myeshop.Core.order.event;

import com.myeshop.Core.order.rest.CartItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
public class OrderCreatedEvent {

    private String orderId;
    private BigDecimal totalPrice;
    private int totalQuantity;
    private String status;
    private Date dateCreated;
    private Date lastUpdated;
    private String customerEmail;
    private String addressId;
    private String paymentId;
    private Set<CartItem> cartItems;
}
