package com.currency.historyservice.controller;

import com.currency.historyservice.dto.HistoryResponseDTO;
import com.currency.historyservice.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/latest")
    public List<HistoryResponseDTO> latest() {
        return historyService.getLatestHistory();
    }
}
