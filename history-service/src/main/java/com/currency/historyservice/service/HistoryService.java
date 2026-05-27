package com.currency.historyservice.service;

import com.currency.historyservice.dto.HistoryResponseDTO;

import java.util.List;

public interface HistoryService {

    List<HistoryResponseDTO> getLatestHistory();
}
