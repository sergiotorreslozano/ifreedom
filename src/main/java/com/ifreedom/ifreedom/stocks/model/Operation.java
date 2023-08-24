package com.ifreedom.ifreedom.stocks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
    private BigDecimal price;
    private Long amount;
    private LocalDateTime time;

    public Operation(String tickerId, BigDecimal price, Long amount, LocalDateTime time) {
        this.tickerId = tickerId;
        this.price = price;
        this.amount = amount;
        this.time = time;
    }
}
