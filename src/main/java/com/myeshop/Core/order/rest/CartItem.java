package com.myeshop.Core.order.rest;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItem {
    String imageUrl;
    String name;
    BigDecimal unitPrice;
    int quantity;
    String productId;
}
