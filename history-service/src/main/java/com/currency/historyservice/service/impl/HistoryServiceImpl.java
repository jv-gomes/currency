package com.currency.historyservice.service.impl;

import com.currency.historyservice.dto.HistoryResponseDTO;
import com.currency.historyservice.service.HistoryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Override
    public List<HistoryResponseDTO> getLatestHistory() {
        return List.of(
                HistoryResponseDTO.builder()
                        .id(1L)
                        .from("USD")
                        .to("BRL")
                        .amount(new BigDecimal("100.00"))
                        .convertedAmount(new BigDecimal("500.00"))
                        .convertedAt(Instant.now())
                        .build()
        );
    }
}
