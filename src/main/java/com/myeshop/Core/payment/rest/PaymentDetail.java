package com.myeshop.Core.payment.rest;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class PaymentDetail {

    private String id;
    private String cardNumber;
    private String cvv;
    private String name;
    private int validUntilMonth;
    private int validUntilYear;
}
