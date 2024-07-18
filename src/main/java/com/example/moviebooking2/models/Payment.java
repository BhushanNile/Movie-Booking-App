package com.example.moviebooking2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private int refNumber;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentGatewayProvider paymentGatewayProvider;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}
