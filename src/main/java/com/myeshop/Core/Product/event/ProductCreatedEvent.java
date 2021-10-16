package com.myeshop.Core.Product.event;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
public class ProductCreatedEvent {

    private String productId;
    private String sku;
    private String name;
    private String description;
    private Boolean active;
    private BigDecimal unitPrice;
    private String imageUrl;
    private int quantity;
    private Date dateCreated;
    private Date lastUpdated;
    private String categoryId;
}
