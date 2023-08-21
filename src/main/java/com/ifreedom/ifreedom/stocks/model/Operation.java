package com.ifreedom.ifreedom.stocks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Setter
@Entity
@AllArgsConstructor
public class Operation {

    @Id
    @GeneratedValue
    private UUID operationId;
    private String tickerId;
    private Long instant;
    private BigDecimal price;
    private Long amount;

    public Operation(String tickerId, Long instant, BigDecimal price, Long amount) {
        this.tickerId = tickerId;
        this.instant = instant;
        this.price = price;
        this.amount = amount;
    }
}
