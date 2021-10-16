package com.myeshop.Core.category.event;

import lombok.Data;

@Data
public class CategoryCreatedEvent {

    private String categoryId;
    private String name;
}
