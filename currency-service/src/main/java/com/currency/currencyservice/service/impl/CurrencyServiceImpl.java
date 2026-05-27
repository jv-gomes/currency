package com.currency.currencyservice.service.impl;

import com.currency.currencyservice.dto.ConversionResponseDTO;
import com.currency.currencyservice.service.CurrencyService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Override
    public ConversionResponseDTO convert(String from, String to, BigDecimal amount) {
        return ConversionResponseDTO.builder()
                .from(from)
                .to(to)
                .amount(amount)
                .rate(BigDecimal.ONE)
                .convertedAmount(amount)
                .build();
    }
}
