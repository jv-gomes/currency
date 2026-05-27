package com.currency.historyservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HistoryResponseDTO {

    private Long id;
    private String from;
    private String to;
    private BigDecimal amount;
    private BigDecimal convertedAmount;
    private Instant convertedAt;
}
