package com.currency.currencyservice.client;

import org.springframework.stereotype.Component;

@Component
public class ExchangeRateClient {

    public String healthCheck() {
        return "exchange-rate-client-ready";
    }
}
