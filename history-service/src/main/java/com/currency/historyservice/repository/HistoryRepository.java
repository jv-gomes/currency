package com.currency.historyservice.repository;

import com.currency.historyservice.entity.ConversionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<ConversionHistory, Long> {
}
