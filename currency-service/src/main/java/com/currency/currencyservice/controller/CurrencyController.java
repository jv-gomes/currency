package com.currency.currencyservice.controller;

import com.currency.currencyservice.dto.ConversionResponseDTO;
import com.currency.currencyservice.service.CurrencyService;
import jakarta.validation.constraints.DecimalMin;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/currency")
@RequiredArgsConstructor
@Validated
public class CurrencyController {

    private final CurrencyService currencyService;

    @GetMapping("/convert")
    public ConversionResponseDTO convert(@RequestParam String from,
                                         @RequestParam String to,
                                         @RequestParam @DecimalMin("0.0") BigDecimal amount) {
        return currencyService.convert(from, to, amount);
    }
}
