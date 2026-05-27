package com.currency.currencyservice.service;

import com.currency.currencyservice.dto.ConversionResponseDTO;

import java.math.BigDecimal;

public interface CurrencyService {

    ConversionResponseDTO convert(String from, String to, BigDecimal amount);
}
