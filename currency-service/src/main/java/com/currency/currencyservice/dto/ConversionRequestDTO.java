package com.currency.currencyservice.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConversionRequestDTO {

    @NotBlank
    private String from;

    @NotBlank
    private String to;

    @DecimalMin("0.0")
    private BigDecimal amount;
}
